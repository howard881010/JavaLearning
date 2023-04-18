package d4_jdk8_time;


import java.time.LocalDate;
import java.time.Period;

public class Demo07Period {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDate = LocalDate.of(1999, 10, 10);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);

        System.out.println(period.getDays());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());

    }
}
