package d1_file;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File f1 = new File("D:/resource");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());

        }
    }
}
