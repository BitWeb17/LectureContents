package Sixteenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketManager extends SocketManager {
    private ServerSocket servSock;
    private Socket[] clntSockArr;

    private int clntCnt;
    private int maxClnt;

    public ServerSocketManager(int portNum, int max)
            throws IOException {
        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.", max);

        servSock = new ServerSocket(portNum);

        clntCnt = 0;
        maxClnt = max;

        clntSockArr = new Socket[max];
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        for(int i = 0; i < maxClnt; i++) {
            clntSockArr[clntCnt++] = servSock.accept();
        }
    }
}
