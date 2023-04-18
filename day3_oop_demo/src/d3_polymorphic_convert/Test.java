package d3_polymorphic_convert;


public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        //a.lookDoor();

        // 強制類型轉換
        Dog d = (Dog) a;
        d.lookDoor();

        // 運行時可能出現問題
        //Turtle t = (Turtle) a;
        // 建議強制轉換前，先判斷變量指向對象的真實類型，再強制類型轉換
        if (a instanceof Turtle) {
            Turtle t = (Turtle) a;
            t.layEggs();
        } else if (a instanceof Dog) {
            Dog d1 = (Dog) a;
            d1.lookDoor();
        }

    }
}
