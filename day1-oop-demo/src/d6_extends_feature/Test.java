package d6_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 1. 子類不能繼承父類構造器
        // 2. 子類是否可以繼承父類的私有成員? 可以，但不能直接訪問
        Tiger tiger = new Tiger();
        tiger.eat();
        //tiger.get();
        // 3. 子類是否可以繼承父類的靜態成員? 我認為不算是繼承，算是共享
        System.out.println(tiger.location);


    }
}

class Animal {
    public void eat () {
        System.out.println("動物要吃東西");
    }
    private void get () {

    }
    public static String location = "動物園";
}
class Tiger extends Animal {

}