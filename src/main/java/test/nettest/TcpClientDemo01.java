package main.java.test.nettest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo01 {

    public static void main(String[] args) {

        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress localhost = InetAddress.getByName("localhost");
            int port = 9999;

            socket = new Socket(localhost, port);

            outputStream = socket.getOutputStream();

            outputStream.write("hello你好".getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
