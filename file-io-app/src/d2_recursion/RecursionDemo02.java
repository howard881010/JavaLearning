package d2_recursion;

public class RecursionDemo02 {
    public static void main(String[] args) {

    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) * n;
        }
    }
}
