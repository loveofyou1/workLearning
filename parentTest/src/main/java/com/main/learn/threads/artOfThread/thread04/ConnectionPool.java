package com.main.learn.threads.artOfThread.thread04;

import com.main.learn.threads.artOfThread.threadArt01.ConnectionDriver;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * 数据库连接池
 *
 * @author Dean
 * @create 2018/9/3
 */
public class ConnectionPool {
    private LinkedList<Connection> pool = new LinkedList<>();


    public ConnectionPool(int initSize) {
        if (initSize > 0) {
            for (int i = 0; i < initSize; i++) {
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }


    public void releaseConnection(Connection connection) {
        if (connection != null) {
            synchronized (pool) {
                //连接释放后需要进行通知，这样其他消费者能够感知到连接池中已经归还了一个连接
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }


    public Connection fetchConnection(long millis) throws InterruptedException {
        synchronized (pool) {
            //完全超时
            if (millis <= 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return pool.removeFirst();
            } else {
                long future = System.currentTimeMillis() + millis;
                long remaining = millis;
                while (pool.isEmpty() && remaining > 0) {
                    pool.wait(millis);
                    remaining = future - System.currentTimeMillis();
                }
                Connection result = null;
                if (!pool.isEmpty()) {
                    result = pool.removeFirst();
                }
                return result;
            }
        }
    }
}
