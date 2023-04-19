package d5_reflectMethod;

public class Dog {
    public void run() {
        System.out.println("狗跑得很快");
    }
    public void eat() {
        System.out.println("狗吃骨頭");
    }

    private String eat(String name) {
        System.out.println("狗吃" + name);
        return "狗吃得很開心";
    }
}
