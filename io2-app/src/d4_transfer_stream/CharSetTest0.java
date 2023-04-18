package d4_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class CharSetTest0 {
    public static void main(String[] args) {
        try (
                // 代碼 UTF-8 ，文件UTF-8，不會亂碼
//                Reader fr = new FileReader("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
//                BufferedReader br = new BufferedReader(fr);

                // 代碼 UTF-8 ，文件GBK，會亂碼
                Reader fr = new FileReader("C:\\Users\\user\\OneDrive\\桌面\\新文字文件1.txt");
                BufferedReader br = new BufferedReader(fr);


        ) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
