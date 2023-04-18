package d2_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {
        // 定義開始結束時間
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";

        // a , b
        String a = "2021-11-11 00:03:47";
        String b = "2021-11-11 00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(a);
        Date d4 = sdf.parse(b);

        if (d3.after(d1) && d3.before(d2)) {
            System.out.println("a成功");
        } else {
            System.out.println("a失敗");
        }

        if (d4.after(d1) && d4.before(d2)) {
            System.out.println("b成功");
        } else {
            System.out.println("b失敗");
        }


    }
}
