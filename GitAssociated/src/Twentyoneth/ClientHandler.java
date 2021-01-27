package Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClientHandler implements Runnable {
    final DataInputStream in;
    final DataOutputStream out;

    private String name;

    Socket sock;
    boolean isOK;

    Scanner scan = new Scanner(System.in);

    public ClientHandler(DataInputStream in, DataOutputStream out,
                         String name, Socket sock) {

        this.in = in;
        this.out = out;
        this.name = name;
        this.sock = sock;

        this.isOK = true;
    }

    @Override
    public void run() {
        String received;

        for(;;) {
            try {
                received = in.readUTF();

                System.out.println(received);

                if(received.equals("q")) {
                    this.isOK = false;
                    this.sock.close();
                    break;
                }

                // StringTokenizer는 특수한 기준자를 바탕으로 문자열을 분리한다.
                StringTokenizer st = new StringTokenizer(received, "#");
                String recipient = st.nextToken();
                String msg2Send = st.nextToken();
                System.out.println("msg2Send = " + msg2Send);
                System.out.println("recipient = " + recipient);

                for(ClientHandler ch : ThreadChatServer.chv) {
                    if(ch.name.equals(recipient) && ch.isOK == true) {
                        ch.out.writeUTF(this.name + ": " + msg2Send);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            this.in.close();
            this.out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
