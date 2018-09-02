package com.main.threads.concurrencyPractice.chapter03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sunlei19
 * @create 2018-03-15 21:09
 */
public class UseThreadLocal {
    private static final String DB_URL = "dburl";
    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
        public Connection initialValue() {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(DB_URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    };


    public static Connection getConnection() {
        return connectionHolder.get();
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
