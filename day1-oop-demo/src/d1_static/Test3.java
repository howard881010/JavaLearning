package d1_static;

public class Test3 {
    public static int onlineNumber = 0;

    public static void test2() {

    }
    private String name;
    private void run() {
        System.out.println(name);
    }
    // 3. 靜態方法中不可以出現this關鍵字


    // 2. 實例方法可以訪問靜態成員也可以訪問實例成員
    public void go() {
        test2();
        System.out.println(name);
        System.out.println(this);

    }

    // 1.靜態方法只能訪問靜態成員、不可以出現this關鍵字
    public static void test() {
        System.out.println(Test3.onlineNumber);
        test2();
        // System.out.println(name);  不能被直接訪問
        // System.out.println(this);  不可以出現this


    }

    public static void main(String[] args) {

    }
}
