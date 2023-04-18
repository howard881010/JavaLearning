package d2_recursion;

import java.io.File;

public class RecursionDemo05 {
    public static void main(String[] args) {
        searchFile(new File("D:/"), "12345.txt");

    }
    // 搜索目錄得全部文件，然後找到指定文件
    public static void searchFile(File dir, String fileName) {
        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            // 判斷是否為空文件夾
            if(files != null && files.length > 0) {
                for (File file : files) {
                    // 判斷是文件還是目錄
                    if (file.isFile()) {
                        if(file.getName().contains(fileName)) {
                            System.out.println("找到了: " + file.getAbsoluteFile());
                            // 啟動她
//                            Runtime r = Runtime.getRuntime();
//                            r.exec(file.getAbsolutePath());
                        }
                    } else {
                        searchFile(file, fileName);
                    }
                }
            }

        } else {
            System.out.println("妳當前搜尋的不是文件夾");
        }

    }
}
