package d6_regex;

public class regexDemo1 {
    public static void main(String[] args) {
        // 需求: 6-20位數字
    }

    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
