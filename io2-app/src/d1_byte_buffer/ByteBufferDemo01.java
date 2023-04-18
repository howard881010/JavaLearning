package d1_byte_buffer;

import java.io.*;

/*
    學會字節流複製
 */
public class ByteBufferDemo01 {
    public static void main(String[] args) {

        try (
                // 只能放置資源
                // 要複製的目標
                InputStream is = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
                InputStream bis = new BufferedInputStream(is);
                // 要複製到的地方
                OutputStream os = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data1.txt");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("複製完成");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
