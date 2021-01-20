package Sixteenth;

import java.io.IOException;

// 서버의 역할: 클라이언트들에게 데이터를 중개
public class MainServer {
    private static final int MAX = 2;

    public static void main(String[] args) throws IOException {
        ServerSocketManager ssm =
                new ServerSocketManager(7777, MAX);

        ssm.waitForClientRequest();

        System.out.println("모두 접속 완료!");

        ssm.checkEachIpAddressInfo();

        ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());
    }
}
