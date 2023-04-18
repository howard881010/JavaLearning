package d9_abstract_template;

public class Test {
    public static void main(String[] args) {
        // 理解模板方法模式，以及使用步驟
        StudentMiddle s = new StudentMiddle();
        s.write();

        StudentChild s1 = new StudentChild();
        s1.write();

    }
}
