package d2_static_util;

import java.util.Random;

public class Util {
    // 由於工具類不需要對象，所以把對象構造器私有化
    private Util() {

    }
    public static String createVerifyCode(int n) {
        String code = "";
        String data = "1qaz2wsx3edc4rfv5tgb6yhn7ujm8ik9ol0pQAZWSXEDCRFVTGBYHNUJMIKOLP";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(i);
        }
        System.out.println("驗整馬" + code);
        return code;
    }
}
