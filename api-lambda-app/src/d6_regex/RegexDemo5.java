package d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String rs = "aaaarewrewrewrwerewrewrbbbqweweeqeqwcccqeqeqeqeq";

        // 準備要從內容找regex的標準 找aaa bbb ccc
        String regex = "([a]{1,3})|([b]{1,3})|([c]{1,3})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rs);

        while (matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
