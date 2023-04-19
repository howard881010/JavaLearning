package d10_tcp5_sms;

import d9_socket4.ServerReaderRunnable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class ServerDemo02 {
    // 定義一個list儲存當前全部再線的socket管道
    public static List<Socket> allOnlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        System.out.println("=====服務端啟動成功");
        // 1. 註冊端口
        ServerSocket serverSocket = new ServerSocket(7777);

        // a. 定義一個使循環由主線程負責不斷接受客戶端的Socket管道連接
        while (true) {
            // 2. 每次接收到socket管道，交給一個獨立的子線程
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "他來了，上線了");

            allOnlineSockets.add(socket);
            new ServerReaderThread(socket).start();

        }
    }
}

class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
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
                // 把消息進行端口轉道到所有的socket
                SendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下線了");
            ServerDemo02.allOnlineSockets.remove(socket);
        }
    }

    private void SendMsgToAll(String msg) throws Exception {
        for (Socket allOnlineSocket : ServerDemo02.allOnlineSockets) {
            PrintStream ps = new PrintStream(allOnlineSocket.getOutputStream());
            ps.println(msg);
            ps.flush();

        }
    }
}

