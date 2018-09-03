package com.main.threads.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sunlei19
 * @create 2018-03-08 10:54
 */
public class NetWorkService implements Runnable {

    private final ServerSocket serverSocket;
    private final ExecutorService pool;

    public NetWorkService(int port, int poolSize) throws IOException {
        serverSocket = new ServerSocket(port);
        pool = Executors.newFixedThreadPool(poolSize);
    }

    @Override
    public void run() {//run in the server
        try {
            for (; ; ) {
                pool.execute(new Handler(serverSocket.accept()));
            }
        } catch (IOException e) {
            pool.shutdown();
        }
    }
}

class Handler implements Runnable {
    private final Socket socket;

    Handler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // read and service request on socket
    }
}
