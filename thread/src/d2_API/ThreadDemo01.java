package d2_API;

public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("1");
        System.out.println(t1.getName());
        t1.start();

        Thread t2 = new MyThread();
        t2.setName("2");
        System.out.println(t2.getName());
        t2.start();

        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("主線程輸出" + i);
        }

    }
}
