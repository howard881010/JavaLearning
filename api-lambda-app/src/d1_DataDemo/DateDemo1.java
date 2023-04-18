package d1_DataDemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        long time1 = System.currentTimeMillis();
        System.out.println(time );
        System.out.println(time1);

        System.out.println("---------------------");
        Date d1 = new Date();
        System.out.println(d1);

        long time2 = System.currentTimeMillis();
        time2 += (3600+121) * 1000;

        Date d2 = new Date(time2);
        System.out.println(d2);

        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3);
    }
}
