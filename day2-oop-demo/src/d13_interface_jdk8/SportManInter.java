package d13_interface_jdk8;


import d12_interface_extends.SportMan;

public interface SportManInter {
    //1. 默認方法，用default修飾(實例方法)
    // 這個方法只能過歸給實現類，由實現類對象調用

    default void run() {
        System.out.println("跑得快");
        go();
    }

    // 靜態方法，必須使用static修飾，必須用接口名自己調用
    static void inAddr() {
        System.out.println("java");
    }

    // 3.私有方法  只能在接口內部才能被訪問
    private void go() {
        System.out.println("開始跑");
    }
}

class PingPongMan implements SportManInter{

}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        SportManInter.inAddr();   //用接口名調用
        //PingPongMan.inAddr();
    }
}

