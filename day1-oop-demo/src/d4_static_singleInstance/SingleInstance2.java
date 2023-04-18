package d4_static_singleInstance;

public class SingleInstance2 {
    private static SingleInstance2 instance = null;
    public static SingleInstance2 getInstance(){
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }
    private SingleInstance2(){

    }
}
