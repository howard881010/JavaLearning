package d2_polymorphic_advantage;

public class Turtle extends Animal {
    public String name = "烏龜";
    @Override
    public void run() {
        System.out.println("烏龜跑的超級慢");
    }
}
