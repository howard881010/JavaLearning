package d7_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序開始");
        try {
            parseTime("2015-01-12 10:23:23");
            System.out.println("功能操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("功能操作失敗");
        }
        System.out.println("程序結束");
    }

    public static void parseTime(String date) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
        InputStream is = new FileInputStream("D:/User.jpg");

    }
}
