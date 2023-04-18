package d14_interface_attention;

public class Test {
    public static void main(String[] args) {

        // 都不常用，了解即可
        // 1. 接口不能創建對象
        // 2. 一個類實現多個接口，多個接口中有同樣的靜態方法不衝突  (靜態方法只能接口自己本身調用，類不能調用)
        // 3. 一個類繼承了父類，同時又實現了接口，父類中和接口中有同名方法，默認用父類的
        Cat c = new Cat();
        c.eat();
        // 4. 一個類實現了多個接口，多個接口中存在同名的默認方法，不衝突，這個類重寫該方法即可
        // 5. 一個街口繼承多個街口，是沒有問題的，如果多個接口中存在規範衝突則不能多繼承
    }
}
interface Food {
    default void eat () {
        System.out.println("接口");
    }
}

class Animal {
    public void eat () {
        System.out.println("父親");
    }
}

class Cat extends Animal implements Food {

}

interface AA{
    default void go() {
        System.out.println("AA");
    }
}

interface BB{
    default void go() {
        System.out.println("BB");
    }
}

class CC implements AA, BB{

    @Override
    public void go() {

    }
}


