package d5_udp4_multicast;

import java.net.*;


public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("====服務端啟動=======");
        MulticastSocket socket = new MulticastSocket(8888);

        // 把當前接收端加入到一個組播中
        //socket.joinGroup(InetAddress.getByName("224.0.0.1"));
        socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.0.1"), 8888),
                NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

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
