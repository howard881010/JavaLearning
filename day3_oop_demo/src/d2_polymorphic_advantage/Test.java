package d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
        // 認識多態形式
        // 父類  對象名稱 = new 子類構造器
        Animal a = new Dog();
        a.run();
        System.out.println(a.name);

        Animal a1 = new Turtle();
        a1.run();
        System.out.println(a1.name);


    }
}
