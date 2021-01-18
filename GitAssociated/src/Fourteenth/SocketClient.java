package Fourteenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    private Socket mSocket;

    private BufferedReader mIn;
    private PrintWriter mOut;

    public SocketClient(String ip, int port) {
        try {
            mSocket = new Socket(ip, port);
            System.out.println(ip + " 연결됨");

            mIn = new BufferedReader(
                    new InputStreamReader(
                            mSocket.getInputStream())
            );
            mOut = new PrintWriter(mSocket.getOutputStream());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void closeSocket() {
        try {
            mSocket.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("연결 해제 성공!");
    }
}
