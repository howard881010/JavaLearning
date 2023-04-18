package d4_polymorphic_test;

// USB設備模擬
/*
    1. 定義USB
    2. 定義USB實現類，鼠標、鍵盤
    3. 創建一個電腦對象，創建USB設備對象，安裝啟動
 */
public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        USB u = new Mouse("logitech");
        c.installUSB(u);
        USB k = new KeyBoard("Leopard");
        c.installUSB(k);
    }
}
