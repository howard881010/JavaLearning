package d3_polymorphic_convert;

public class Turtle extends Animal {
    public String name = "烏龜";
    @Override
    public void run() {
        System.out.println("烏龜跑的超級慢");
    }

    //獨有功能
    public void layEggs() {
        System.out.println("烏龜會下蛋");
    }
}
