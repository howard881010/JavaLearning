package d4_jdk8_time;


import java.time.Duration;
import java.time.LocalDateTime;

public class Demo08duration {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthDate = LocalDateTime.of(1999, 10, 10, 10, 0, 0);

        Duration duration = Duration.between(birthDate, today);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
