package d4_thread_synchronized_code;

public class Account {
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(double money) {
        this.money = money;
    }

    public Account() {
    }

    public static void run(){
        synchronized (Account.class) {

        }
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "取錢成功，取出: " + money);
                this.money -= money;
                System.out.println(name + "取後還剩下 " + this.money);
            } else {
                System.out.println(name + "餘額不足");
            }
        }


    }
}
