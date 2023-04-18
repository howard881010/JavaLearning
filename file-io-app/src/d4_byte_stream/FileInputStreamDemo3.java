package d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        File f = new File("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        byte[] buffer = new byte[(int) f.length()];
        int len = is.read(buffer);
        System.out.println(new String(buffer));

        System.out.println("========================");
        InputStream is1 = new FileInputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        byte[] buffer1 = is1.readAllBytes();
        System.out.println(new String(buffer1));





    }
}
