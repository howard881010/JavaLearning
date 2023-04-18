package d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("====服務端啟動=======");
        DatagramSocket socket = new DatagramSocket(8888);
        // 創建數據包
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        // 等待接受數據
        socket.receive(packet);

        int len = packet.getLength();
        String rs = new String(buffer, 0, len);
        System.out.println("收到了: " + rs);

        String ip = packet.getSocketAddress().toString();
        System.out.println("對方地址: " + ip);

        int port = packet.getPort();
        System.out.println("對方端口: " + port);

        socket.close();

    }
}
