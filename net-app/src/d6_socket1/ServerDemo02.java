package d6_socket1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
    public static void main(String[] args) {
        try {
            System.out.println("=====服務端啟動成功");
            // 1. 註冊端口
            ServerSocket serverSocket = new ServerSocket(7777);
            // 2. 必須調用accept方法，等待客戶端的accept連接請求，建立Socket通信管道
            Socket socket = serverSocket.accept();
            // 3.從socket通信管道中得到一個字節輸入流
            InputStream is = socket.getInputStream();
            // 4. 包裝成緩衝字節輸入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 5. 按照行讀取消息
            String msg;
            if ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + "說了: " + msg);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
