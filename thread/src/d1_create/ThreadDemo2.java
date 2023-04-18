package d1_create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread t = new Thread(target);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主 線程進行輸出" + i);
        }

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子線程進行輸出" + i);
        }
    }
}
