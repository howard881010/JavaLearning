package d3_thread_safe;

public class ThreadDemo {
    public static void main(String[] args) {
        Account acc = new Account(100000);
        new DrawThread(acc, "小名").start();
        new DrawThread(acc, "小紅").start();
    }
}
