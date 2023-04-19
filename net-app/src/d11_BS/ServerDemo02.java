package d11_BS;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;


public class ServerDemo02 {
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws Exception {
        // 1. 註冊端口
        ServerSocket serverSocket = new ServerSocket(7777);

        // a. 定義一個使循環由主線程負責不斷接受客戶端的Socket管道連接
        while (true) {
            // 2. 每次接收到socket管道，交給一個獨立的子線程
            Socket socket = serverSocket.accept();
            Runnable target = new ServerReaderRunnable(socket);
            pool.execute(target);

        }
    }
}

