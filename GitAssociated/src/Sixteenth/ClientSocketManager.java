package Sixteenth;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketManager extends SocketManager {
    private Socket clntSock;

    public ClientSocketManager(String hostIp, int portNum)
            throws IOException {
        clntSock = new Socket(hostIp, portNum);
    }
}
