package d2_modifier;

public class Fu {
    private void privateMethod() {
        System.out.println("private");
    }
    // 包訪問權限
    void method() {
        System.out.println("缺省");
    }

    protected void protectedMethod() {
        System.out.println("protected");
    }

    public void publicMethod() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.method();
        f.privateMethod();
        f.protectedMethod();
        f.publicMethod();
    }
}
