package d1_create;

public class ThreadDemo1 {
    public static void main(String[] args) {
        // 3.
        Thread t = new MyThread();
        // 4.
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主線程進行輸出" + i);
        }
    }
}

// 1.
class MyThread extends Thread {
    // 2.
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子線程進行輸出" + i);
        }
    }
}
