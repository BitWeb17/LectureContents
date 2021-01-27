package Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ThreadChatServer {
    static Vector<ClientHandler> chv = new Vector<>();

    static int i = 0;

    public static void main(String[] args) throws IOException {
        // 서버의 서비스(7777)을 시작
        ServerSocket servSock = new ServerSocket(7777);

        Socket sock;

        for(;;) {
            System.out.println("지금부터 클라이언트의 입장을 대기합니다.");
            sock = servSock.accept();

            System.out.println("새로운 클라이언트가 입장: " + sock);

            // 송신 및 수신 채널 할
            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());

            System.out.println("클라이언트의 요청을 처리하기 위한 핸들러!");

            // 클라이언트용 핸들러 작성 필요당
            // 서버와 클라이언트 요처에 대한 응답 처
            ClientHandler ch = new ClientHandler(in, out, "client" + i, sock);

            Thread t = new Thread(ch);

            System.out.println("클라이언트 리스트 관리!");

            chv.add(ch);

            t.start();

            i++;
        }
   }
}
