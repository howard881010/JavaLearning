package d4_byte_stream;

import java.io.*;

/*
    學會字節流複製
 */
public class CopyDemo05 {
    public static void main(String[] args) throws Exception {
        // 要複製的目標
        InputStream is = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        // 要複製到的地方
        OutputStream os = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data1.txt");
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer))!= -1) {
            os.write(buffer, 0, len);
        }
        System.out.println("複製完成");
        os.close();
        is.close();
    }
}
