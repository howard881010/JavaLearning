package d5_resource;

import java.io.*;

/*
    學會字節流複製
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        // 要複製的目標
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
            // 要複製到的地方
            os = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data1.txt");
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer))!= -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("複製完成");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // 無論如何都會執行Finally
            System.out.println("=========Finally============");
            try {
                if (is!=null) is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (os!=null) os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
