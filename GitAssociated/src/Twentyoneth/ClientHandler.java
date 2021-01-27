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

                StringTokenizer st = new StringTokenizer(received, "#");
                String msg2Send = st.nextToken();
                String recipient = st.nextToken();

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
