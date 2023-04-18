package d1_create;

public class ThreadDemoOther02 {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子線程輸出" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子線程1輸出" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子線程2輸出" + i);
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主線程輸出" + i);
        }
    }
}
