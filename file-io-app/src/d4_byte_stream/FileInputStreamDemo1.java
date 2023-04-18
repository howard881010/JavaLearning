package d4_byte_stream;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");

//        int b1 = is.read();
//        System.out.println((char) b1);
//
//        int b2 = is.read();
//        System.out.println((char) b2);

        // 讀取完畢的話，會返回-1
        // 3. 使用循環改進，但不能讀中文字
        int b;
        while ((b = is.read()) != -1) {
            System.out.println((char) b);
        }
    }
}
