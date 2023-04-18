package d2_simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年MM月dd日 HH:mm:ss EEE a");
        String rs = sdf.format(d);
        System.out.println(rs);
        System.out.println("----------");

        long time = System.currentTimeMillis() + 121 * 1000;
        String rs2 = sdf.format(time);
        System.out.println(rs2);


    }
}
