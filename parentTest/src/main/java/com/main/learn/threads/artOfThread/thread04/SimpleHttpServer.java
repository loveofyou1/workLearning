package com.main.learn.threads.artOfThread.thread04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * web服务端使用线程池
 *
 * @author Dean
 * @create 2018/9/3
 */
public class SimpleHttpServer {
    //处理HttpRequest的线程池
    static ThreadPool<HttpRequestHandler> threadPool = new DefaultThreadPool(1);
    //SimpleHttpServer的根路径
    static String path;
    static ServerSocket serverSocket;

    //服务器监听接口
    static int port = 8080;


    public static void setPort(int port) {
        if (port > 0) {
            SimpleHttpServer.port = port;
        }
    }


    public static void setPath(String basePath) {
        if (basePath != null && new File(basePath).exists() && new File(basePath).isDirectory()) {
            SimpleHttpServer.path = basePath;
        }
    }


    /**
     * 启动SimpleHttpServer
     *
     * @throws Exception
     */
    public static void start() throws Exception {
        serverSocket = new ServerSocket(port);
        Socket socket = null;
        while ((socket = serverSocket.accept()) != null) {
            //接受一个客户端Socket，生成一个HttpRequestHandler，放入线程池执行
            threadPool.execute(new HttpRequestHandler(socket));
        }
        serverSocket.close();
    }


    static class HttpRequestHandler implements Runnable {

        private Socket socket = null;


        public HttpRequestHandler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            String line = null;
            BufferedReader bufferedReader = null;
            BufferedReader reader = null;
            PrintWriter out = null;
            InputStream in = null;
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String header = reader.readLine();
                //相对路径计算出绝对路径
                String filePath = path + header.split(" ")[1];
                out = new PrintWriter(socket.getOutputStream());
                //如果请求资源的后缀为jpg或者ico，则读取资源并输出
                if (filePath.endsWith("jpg") || filePath.endsWith("ico")) {
                    in = new FileInputStream(filePath);
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    int i = 0;
                    while ((i = in.read()) != -1) {
                        baos.write(i);
                    }
                    byte[] array = baos.toByteArray();
                    System.out.println("HTTP/1.1 200 ok");
                    System.out.println("Server:Molly");
                    System.out.println("Content-type:image/jpeg");
                    System.out.println("Content-length:" + array.length);
                    System.out.println("");
                    socket.getOutputStream().write(array, 0, array.length);
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
                    out = new PrintWriter(socket.getOutputStream());
                    System.out.println("HTTP/1.1 200 ok");
                    System.out.println("Server:Molly");
                    System.out.println("Content-type:text/html;charset=UTF-8");
                    System.out.println("");
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
                out.flush();
            } catch (Exception e) {
                System.out.println("HTTP/1.1 500");
                System.out.println(" ");
                out.flush();
                e.printStackTrace();
            } finally {
                close(bufferedReader, in, reader, out, socket);
            }
        }
    }


    /**
     * 关闭流或者Socket
     *
     * @param closeables
     */
    private static void close(Closeable... closeables) {

        if (closeables != null) {
            for (Closeable closeable : closeables) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
