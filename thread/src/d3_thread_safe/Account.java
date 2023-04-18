package d3_thread_safe;

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

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name + "取錢成功，取出: " + money);
            this.money -= money;
            System.out.println(name + "取後還剩下 " + this.money);
        } else {
            System.out.println(name + "餘額不足");
        }


    }
}
