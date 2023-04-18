package d4_static_singleInstance;

public class Test1 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1==s2);
    }
}
