package Sixteenth;

import java.io.IOException;

// 서버의 역할: 클라이언트들에게 데이터를 중개
public class MainServer {
    private static final int MAX = 3;

    public static void main(String[] args)
            throws IOException, InterruptedException {
        ServerSocketManager ssm =
                new ServerSocketManager(7777, MAX);

        ssm.waitForClientRequest();

        System.out.println("모두 접속 완료!");

        ssm.checkEachIpAddressInfo();

        ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());

        // 이제 서버가 할 일은
        // 클라이언트들에게 승패 결과와
        // 각자가 무엇을 제출했는지 표시해주는 것
        if(ssm.canWeGetWinner(ssm.getMaxClnt())) {
            System.out.println("승패가 결정되었습니다.");
        } else {
            System.out.println("무승부: 게임을 다시 시작합니다.");
        }
    }
}
