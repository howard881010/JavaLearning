package d3_static_code;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StaticDemo1 {
    public static String schoolName;
    public static ArrayList<String> cards = new ArrayList<>();
    static {
        System.out.println("靜態代碼快被觸發了");
        schoolName = "黑馬";  //初始化靜態資源
    }
    {
        System.out.println("實例代碼執行");
    }

    public static void main(String[] args) {
        System.out.println("Main方法被執行了");
        System.out.println(schoolName);
        StaticDemo1 s1 = new StaticDemo1();

    }
}
