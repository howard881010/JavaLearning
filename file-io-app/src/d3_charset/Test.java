package d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    目標: 學會編碼跟解碼
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "abc我愛你";
        byte[] bytes = name.getBytes();   // UTF-8
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 解碼
        String rs = new String(bytes);
        System.out.println(rs);
    }
}
