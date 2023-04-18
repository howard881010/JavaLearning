package d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("===客戶端啟動=====");

        // 1. 創建發送端對象
        DatagramSocket socket = new DatagramSocket();

        // 2. 創建一個數據包對象，封裝數據
        /*
            public DatagramPacket(byte buf[], int length) {
        setData(buf, offset, length);
    }
         */
        byte[] buffer = "我是一顆快樂的樹".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

        // 3. 發送數據
        socket.send(packet);
        socket.close();
    }
}
