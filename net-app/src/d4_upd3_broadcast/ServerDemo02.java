package d4_upd3_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("====服務端啟動=======");
        DatagramSocket socket = new DatagramSocket(8888);
        // 創建數據包
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);


        while (true) {
            // 等待接受數據
            socket.receive(packet);
            int len = packet.getLength();
            String rs = new String(buffer, 0, len);
            System.out.println("收到了來自: " + packet.getAddress() + ", 對方端口是" + packet.getPort() + ", 消息是: " + rs);
        }
    }
}
