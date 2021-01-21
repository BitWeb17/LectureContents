package Seventeenth;

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

        super(max);

        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);

        servSock = new ServerSocket(portNum);

        clntCnt = 0;
        maxClnt = max;

        clntSockArr = new Socket[max];
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        clntSockArr[clntCnt] = servSock.accept();

        System.out.println(
                "[" + clntSockArr[clntCnt++].getInetAddress() +
                        "] client connected"
        );
    }

    public void checkEachIpAddressInfo() {
        for(int i = 0; i < maxClnt; i++) {

        }
    }

    public Socket[] getClntSockArr() {
        return clntSockArr;
    }

    public int getMaxClnt() {
        return maxClnt;
    }

    public void setClntCnt(int clntCnt) {
        this.clntCnt = clntCnt;
    }
}
