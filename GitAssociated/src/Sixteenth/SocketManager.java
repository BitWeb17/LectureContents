package Sixteenth;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SocketManager {
    private final int ZERO = 0;
    private final int ONE = 1;

    private OutputStream[] out;
    private InputStream[] in;

    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    // send용 [현재 개발 관점은 클라이언트 입장]
    public SocketManager() {
        scan = new Scanner(System.in);

        //in = new InputStream[ONE];
        out = new OutputStream[ONE];
    }

    // recv용 [현재 개발 관점은 서버 입자]
    public SocketManager(int num) {
        //scan = new Scanner(System.in);

        out = new OutputStream[num];
        in = new InputStream[num];
    }

    public void send(Socket sock) throws IOException {
        System.out.print("숫자를 입력하세요: ");
        String str = scan.nextLine();

        out[ZERO] = sock.getOutputStream();
        out[ZERO].write(str.getBytes());
    }

    /*
    public void send(Socket[] sock, int num) throws IOException {
        for(int i = ZERO; i < num; i++) {
            out[i] = sock[i].getOutputStream();

            writer = new PrintWriter(out[i], true);

            writer.println(new Date().toString());
        }
    }
     */

    public void recv(Socket[] sock, int num) throws IOException {
        for(int i = 0; i < num; i++) {
            in[i] = sock[i].getInputStream();

            reader = new BufferedReader(new InputStreamReader(in[i]));

            System.out.println("msg: " + reader.readLine());
        }
    }
}
