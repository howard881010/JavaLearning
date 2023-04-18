package d6_thread_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money;
    // 唯一不可替換
    private final Lock lock = new ReentrantLock();

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

    public static void run() {
        synchronized (Account.class) {

        }
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        try {
            lock.lock();
            if (this.money >= money) {
                System.out.println(name + "取錢成功，取出: " + money);
                this.money -= money;
                System.out.println(name + "取後還剩下 " + this.money);
            } else {
                System.out.println(name + "餘額不足");
            }

        } finally {
            lock.unlock();
        }


    }
}
