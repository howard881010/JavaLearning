package d8_threadpool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "輸出了, HelloWorld" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + "本任務線程綁訂了，線程進入休眠");
            Thread.sleep(100000000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
