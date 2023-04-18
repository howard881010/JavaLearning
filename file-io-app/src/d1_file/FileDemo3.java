package d1_file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\user\\OneDrive\\桌面\\Inked擷取.jpg");
        System.out.println(f.createNewFile());
        File f1 = new File("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D:/resource/aaa");
        System.out.println(f2.mkdir());

        File f3 = new File("D:/resource/ccc/eee/eee/ddd");
        System.out.println(f2.mkdirs());

        System.out.println(f1.delete());
        File f4 = new File("C:\\Users\\user\\OneDrive\\桌面\\Inked擷取.jpg");
        System.out.println(f4.delete());



    }
}
