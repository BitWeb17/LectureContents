package Fifteenth;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketServerTest {
    public static void main(String[] args) {
        // 문자열을 숫자로 바꾸는 기
        int port = Integer.parseInt("33333");

        try {
            // 소켓이란 ? 네트워킹을 할 수 있는 클래스 객체
            // 서버 소켓 생성시 서비스 번호를 부여해야 하는데
            // 이 서비스 번호로 port(33333)을 설정했다.법
            // 네트워크 포트가 16비트를 사용하므로 제한은 0 ~ 65535
            // (단, 고정된 포트를 사용하면 안됨)
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server: Listening - " + port);

            while(true) {
                // accept()의 경우 클라이언트가 접속을 요청했는지 체크해서
                // 만약 요청 있었다면 요청을 승인한다.
                // (accept()는 블로킹 연산이다)

                // 결국 sock은 클라이언트 소켓을 의미하게 된다.
                // 그래서 좀 더 가독성이 좋은 코드는 Socket clntSock으로 작성하면 좋을
                // (전화왔을때 통화하기 슬라이드가 accept()라 보면됨)
                Socket sock = servSock.accept();

                // 접속한 클라이언트의 IP를 확인하는 코드
                System.out.println(
                        "[" + sock.getInetAddress() +
                        "] client connected"
                );

                // 출력을 위한 객체를 만듭니다.
                // 클라이언트에게 출력할 객체를 만든다.
                OutputStream out = sock.getOutputStream();
                // println의 결과를 out으로 전송한다라는 뜻
                // 내가 서버에 요청하는 것: 출력이 아닌 입력이다.
                // 서버가 처리해서 돌려주는 것: 이것이 출력이다.
                PrintWriter writer = new PrintWriter(out, true);
                // 즉 여기서 println의 출력은 클라이언트에게 간다.
                // Date()는 시간을 가져온다.
                // toString()은 문자열로 만듬

                // 접속 상대에게 보내고 싶은 데이터를 이곳에 기록한다.
                writer.println(new Date().toString());

                // 입력: 클라이언트
                // 클라이언트가 서버에게 보낸 것
                InputStream in = sock.getInputStream();

                // 소켓을 통해 데이터를 읽을땐 무조건 아래 형식으로 진행합니다.
                // 바뀌지 않으니 항상 고정해서 사용하면 됩니다.
                // 이 버퍼에 클라이언트가 보낸 내용이 들어있다.
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                // 그러므로 reader.readLine()을 통해서
                // 내용을 읽으면 클라이언트가 보낸 내용을 출력할 수 있게 된다.
                System.out.println("msg: " + reader.readLine());
            }
        } catch (IOException e) {
            // Exception은 예외 처리로
            // I/O 예외가 발생하면 무엇인가 잘못되었음을 감지하고
            // 어디가 잘못되었는지 출력하도록 구성된다.
            // ex) 통신중에 갑자기 네트워크 불안정으로 통신이 끊기면
            //     catch가 I/O 예외를 감지하고 아래 코드가 동작하게 된다.
            // 아래 코드는 에러 메시지를 출력하는 코드로 언제나 동일하게 작성하면 됨
            System.out.println("Server Exception: " + e.getMessage());

            // 콜 스택(매서드 호출)이 어떤식으로 이뤄졌는지 상태를 보여줌
            // 디버깅을 위해서 많이 사용하는 편
            e.printStackTrace();
        }
    }
}
