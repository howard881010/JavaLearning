package d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請說: ");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("離線成功");
                socket.close();
                break;
            }
            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

            // 3. 發送數據
            socket.send(packet);
        }

    }
}
