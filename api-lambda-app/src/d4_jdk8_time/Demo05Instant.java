package d4_jdk8_time;


import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Demo05Instant {
    public static void main(String[] args) {
        // 得到一個instant的時間戳對象
        Instant instant = Instant.now();
        System.out.println(instant);

        // 得到系統此刻的時間戳
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        // 如何去返回date對象
        Date date = Date.from(instant);
        System.out.println(date);

        Instant i2 = date.toInstant();
        System.out.println(i2);

    }
}
