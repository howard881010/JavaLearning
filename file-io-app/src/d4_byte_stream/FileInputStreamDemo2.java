package d4_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        System.out.println("讀取了幾個字節: " + len);
//        String rs = new String(buffer);
//        System.out.println(rs);
//
//        int len1 = is.read(buffer);
//        System.out.println("讀取了幾個字節: " + len1);
//        String rs1 = new String(buffer);
//        System.out.println(rs1);
//
//        int len2 = is.read(buffer);
//        System.out.println("讀取了幾個字節: " + len2);
//        String rs2 = new String(buffer, 0, len2);
//        System.out.println(rs2);
        // 3.循環讀取
        byte[] buffer = new byte[3];
        int len;
        while((len = is.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));

        }



    }
}
