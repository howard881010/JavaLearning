package d4_static_singleInstance;

public class Test2 {
    // 理解懶漢單例
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        System.out.println(s1 == s2);

    }
}
