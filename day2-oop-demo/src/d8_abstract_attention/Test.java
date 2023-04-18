package d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        // 1. 類有的，抽象類都有
        // 2. 抽象類中可以沒有抽象方法，但有抽象方法的必須是抽象類
        // 3. 繼承抽象類，必須寫完所有的重寫方法，否則這個類也必須定義抽象類
        // 4. 不能用abstract修飾變量、代碼快、構造器
        // 5. 得到了抽象方法，失去了創建對象的能力   最重要
        // 為甚麼? 反證法: 假如抽象類可以創建對象，抽象方法沒辦法跑，因為沒有對象，不管有沒有方法，也是不行
        // Aniaml a = new Animal();
    }
}

abstract class Animal{

}
