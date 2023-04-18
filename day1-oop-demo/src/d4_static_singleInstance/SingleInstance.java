package d4_static_singleInstance;


//使用惡漢單例
public class SingleInstance {
    //2.對象只能有一個
    public static SingleInstance instance = new SingleInstance();
    //1. 構造器私有化
    private SingleInstance(){
    }
}
