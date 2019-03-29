package com.main.learn.threads.concurrencyPractice.chapter6;

import com.alibaba.fastjson.JSON;
import sun.misc.Request;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2019/3/29
 */
public class LifecycleWebServer {
    private final ExecutorService executorService = new ThreadPoolExecutor(100, 10, 10000, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (!executorService.isShutdown()) {
            try {
                final Socket conn = serverSocket.accept();
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        handleRequest(conn);
                    }
                });
            } catch (RejectedExecutionException e) {
                if (!executorService.isShutdown()) {
                    System.out.println("task submission rejected" + JSON.toJSONString(e));
                }
            }
        }
    }

    public void stop() {
        executorService.shutdown();
    }

    public void handleRequest(Socket connection) {
        Request req = readRequest(connection);
        if (isShutdownRequest(req)) {
            stop();
        } else {
            dispatchReqeust(req);
        }
    }

    private void dispatchReqeust(Request req) {
    }

    private boolean isShutdownRequest(Request req) {
        return true;
    }

    private Request readRequest(Socket connection) {
        return null;
    }
}

