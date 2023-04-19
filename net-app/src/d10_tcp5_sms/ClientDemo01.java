package d10_tcp5_sms;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
    完成Socket網路編程客戶端發送
 */
public class ClientDemo01 {
    public static void main(String[] args) {
        try {
            System.out.println("客戶端啟動成功");
            // 1. 創建socket管道，請求服務端的連接
            // 服務器ip地址，服務端端口
            Socket socket = new Socket("192.168.168.87", 7777);
            new ClientReaderThread(socket).start();
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ClientReaderThread extends Thread {
    private Socket socket;

    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println("收到消息了: " + msg);
            }
        } catch (Exception e) {

            System.out.println("服務端把你踢出去了");
        }
    }
}
