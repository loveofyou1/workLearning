package com.main.learn.threads.concurrencyPractice.chapter6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadWebServer {
    public static void main(String[] args) throws IOException{
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            Socket connection = socket.accept();
            handleRequeset(connection);
        }
    }

    private static void handleRequeset(Socket connection) {
        connection.getPort();
    }
}
