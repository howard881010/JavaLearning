package d9_timer;
/*
    Timer 定時器的使用跟了解
 */

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "執行一次" + new Date());
            }
        }, 3000, 2000);
    }
}
