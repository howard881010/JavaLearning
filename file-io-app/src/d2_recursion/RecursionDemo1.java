package d2_recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("======test被執行");
        test();
    }
}
