package d9_Lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Lambda只能簡化接口只有一個抽象方法的匿名內部形式
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老師很會游泳");
            }
        };
        Swimming s2 = () -> {
            System.out.println("學生很會游");
        };
        go(s2);
        go(() -> {
            System.out.println("學生很會游");
        });
    }

    public static void go (Swimming s){
        System.out.println("開始");
        s.swim();
        System.out.println("結束");
    }
}
@FunctionalInterface
interface Swimming{
    void swim();
}