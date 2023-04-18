package d9_Lambda;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {

            @Override
            public void run() {
                System.out.println("烏龜跑得快");
            }
        };
        a.run();

    }
}


abstract class Animal{
    public abstract void run();
}
