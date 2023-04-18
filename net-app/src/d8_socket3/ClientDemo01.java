package d8_socket3;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
    完成ThreadPool優化
 */
public class ClientDemo01 {
    public static void main(String[] args) {
        try {

            // 1. 創建socket管道，請求服務端的連接
            // 服務器ip地址，服務端端口
            Socket socket = new Socket("192.168.168.87", 7777);
            // 2. 從SOCKET通信管道中得到一個字節輸出流 負責發送數據
            OutputStream os = socket.getOutputStream();
            // 3. 把低級的字節流包裝程打印流
            PrintStream ps = new PrintStream(os);
            // 4.發送消息
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("請說");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }

            // 不要去關
            //ps.flush();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
