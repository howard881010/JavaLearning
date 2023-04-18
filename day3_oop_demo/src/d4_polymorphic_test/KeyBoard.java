package d4_polymorphic_test;

public class KeyBoard implements USB{
    private String name;
    public KeyBoard(){}

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功接入設備");
    }

    @Override
    public void unConnect() {
        System.out.println(name + "從設備彈出");
    }

    // 獨有功能
    public void keyDown() {
        System.out.println(name + "點擊666");
    }
}
