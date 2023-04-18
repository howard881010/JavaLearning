package d4_jdk8_time;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Demo6DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss EEE a");
        System.out.println(dtf.format(ldt));
        System.out.println(ldt.format(dtf));


        // 解析字符串時間
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        // 解析當前字符串時間成為本地日期時間對象
        LocalDateTime ldt1 = LocalDateTime.parse("2019-11-11 11:11:11", dtf1);
        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfYear());


    }
}
