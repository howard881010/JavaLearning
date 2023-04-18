package d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog(); 
        go(d);
        // 不能調用獨有功能
        //d.lookDoor();
        Animal t = new Turtle();
        go(t);

    }
    public static void go(Animal a) {
        System.out.println("預備");
        a.run();
        System.out.println("結束");
    }
}
