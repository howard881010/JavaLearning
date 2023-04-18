package d9_abstract_template;

public abstract class Student {
    public final void write() {
        System.out.println("我的爸爸");
        // 正文
        System.out.println(writeMain());

        System.out.println("我的爸爸太好了");
    }
    public abstract String writeMain();
}
