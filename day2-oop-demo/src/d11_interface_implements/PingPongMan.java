package d11_interface_implements;

public class PingPongMan implements SportMan, Law{
    private String name;
    public PingPongMan(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name + "必須跑步訓練 ");
    }

    @Override
    public void competition() {
        System.out.println(name + "必須要比賽");
    }

    @Override
    public void rule() {
        System.out.println(name + "必須要守法");
    }
}
