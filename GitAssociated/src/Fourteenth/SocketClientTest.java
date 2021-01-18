package Fourteenth;

import java.net.UnknownHostException;

public class SocketClientTest {
    public static void main(String[] args) throws UnknownHostException {
        SocketClient sc;
        GetLocalHost glh = new GetLocalHost();

        glh.getLocalHostInfo();
    }
}
