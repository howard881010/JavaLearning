package d2_API;

public class ThreadDemo02 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("輸出: " + i);
            if (i == 3) {
                Thread.sleep(3000);
            }
        }
    }
}
