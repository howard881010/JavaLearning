package d1_file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\user\\OneDrive\\桌面\\Inked擷取.jpg");

        long size = f.length();
        System.out.println(size);


        // 2. 支持絕對路徑，也支持相對路徑
        // 絕對路徑
        File f1 = new File("C:/Users/user/OneDrive/桌面/Inked擷取.jpg");
        System.out.println(f1.length());
        // 相對路徑
        File f2 = new File("file-io-app\\src\\data.txt");
        System.out.println(f2.length());

        // 3. File可以創建文件，也可以創建文件夾
        File f3 = new File("C:\\Users\\user\\OneDrive\\桌面\\test");
        System.out.println(f3.exists());
    }
}
