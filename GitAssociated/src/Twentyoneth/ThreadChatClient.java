package Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ThreadChatClient {
    final static int SERVPORT = 7777;

    public static void main(String[] args)
            throws UnknownHostException, IOException {

        Scanner scan = new Scanner(System.in);

        InetAddress ip = InetAddress.getByName("localhost");

        // 특정 ip를 가지고 서비스(포트 번호)에 접속 요청
        Socket sock = new Socket(ip, SERVPORT);

        DataInputStream in = new DataInputStream(sock.getInputStream());
        DataOutputStream out = new DataOutputStream(sock.getOutputStream());

        // transfer(송신)
        Thread tx = new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;) {
                    String msg = scan.nextLine();

                    try {
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // receive(수신)
        Thread rx = new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;) {
                    try {
                        String msg = in.readUTF();
                        System.out.println("rx: " + msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        tx.start();
        rx.start();
    }
}
