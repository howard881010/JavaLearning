package d1_polymorphic;

public class Dog extends Animal{
    public String name = "狗";
    @Override
    public void run() {
        System.out.println("狗跑的超快");
    }

    // 獨有功能

    public void lookDoor() {
        System.out.println("狗在看門");
    }
}
