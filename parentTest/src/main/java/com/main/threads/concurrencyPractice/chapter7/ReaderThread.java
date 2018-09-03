package com.main.threads.concurrencyPractice.chapter7;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 封装非标准的取消操作:
 * 通过改写interrupt方法将非标准的取消操作封装在Thread中
 *
 * @author sunlei19
 * @create 2018-03-19 15:41
 */
public class ReaderThread extends Thread {
    private final Socket socket;
    private final InputStream in;

    public ReaderThread(Socket socket, InputStream in) {
        this.socket = socket;
        this.in = in;
    }

    public void interrupt() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            super.interrupt();
        }
    }

    public void run() {
        try {
            byte[] buf = new byte[1000];
            while (true) {
                int count = in.read(buf);
                if (count < 0) {
                    break;
                } else if (count > 0) {
                    processBuffer(buf, count);
                }
            }
        } catch (IOException e) {
            //允许线程退出
            e.printStackTrace();
        }
    }

    private void processBuffer(byte[] buf, int count) {
    }

}
