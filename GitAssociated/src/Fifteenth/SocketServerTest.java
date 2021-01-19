package Fifteenth;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketServerTest {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");

        try {
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server: Listening - " + port);

            while(true) {
                Socket sock = servSock.accept();

                System.out.println(
                        "[" + sock.getInetAddress() +
                        "] client connected"
                );

                OutputStream out = sock.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);
                writer.println(new Date().toString());

                InputStream in = sock.getInputStream();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                System.out.println("msg: " + reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
