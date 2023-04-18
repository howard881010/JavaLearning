package d8_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
    public static void main(String[] args) throws Exception {

        System.out.println("=====服務端啟動成功");
        // 1. 註冊端口
        ServerSocket serverSocket = new ServerSocket(7777);
        // a. 定義一個使循環由主線程負責不斷接受客戶端的Socket管道連接
        while (true) {
            // 2. 每次接收到socket管道，交給一個獨立的子線程
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "他來了，上線了");
            new ServerReaderThread(socket).start();
        }
    }
}

