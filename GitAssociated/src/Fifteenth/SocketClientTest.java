package Fifteenth;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientTest {
    public static void main(String[] args) {
        // 내가 접속할 서버의 IP 주소를 적습니다.
        String hostname = "192.168.0.9";
        // 서버에 여러 서비스가 있을 수 있는데
        // 그 중에서 내가 사용하고자 하는 서비스의 포트 번호를 적습니다.
        int port = 33333;

        for(int i = 0; i < 10; i++) {
            try {
                // Socket 객체를 할당해서
                // 서버의 IP, 포트 번호를 가지고 접속을 요청합니다.
                // 서버에 대한 소켓을 획득하게 됩니다.
                // 이 요청이 들어갈때 서버의 accept()가 동작하게 됩니다.
                // 예를 들자면 이 행위는 전화를 거는것과 같다.
                // (서버쪽 주석을 살펴보면 감이 더 잘 올 것이다)
                Socket sock = new Socket(hostname, port);

                // 서버의 출력을 획득
                // 즉 서버가 수신하게 만들도록 설정을 해주는 것
                OutputStream out = sock.getOutputStream();

                String str = "Hello Network Programming";
                // 위의 문자열을 바이트 단위로 쪼개서 서버로 전송한다.
                out.write(str.getBytes());

                // 서버의 입력을 생성(수신 준비)
                InputStream in = sock.getInputStream();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                // 서버가 보낸 내용을 time에 저장하고 출력한다.
                String time = reader.readLine();
                System.out.println(time);

                // UnknownHostException: 내가 접속하려는 IP를 찾지 못할 때
            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());

            } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
            }
        }
    }
}
