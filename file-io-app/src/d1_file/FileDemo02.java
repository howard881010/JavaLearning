package d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\user\\OneDrive\\桌面\\Inked擷取.jpg");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());

        System.out.println(f1.getName());
        System.out.println(f1.length());

        long time = f1.lastModified();
        System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time));

        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        System.out.println("-------------------------------");


        File f2 = new File("file-io-app\\src\\data.txt");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());

        System.out.println(f2.getName());
        System.out.println(f2.length());

        long time1 = f2.lastModified();
        System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time1));

        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
    }
}
