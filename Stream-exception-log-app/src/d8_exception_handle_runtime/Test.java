package d8_exception_handle_runtime;

public class Test {
    public static void main(String[] args) {
        System.out.println("程序開始");
        try {
            divide(10, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序結束");
    }

    public static void divide(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a/b;
        System.out.println(c);
    }

}
