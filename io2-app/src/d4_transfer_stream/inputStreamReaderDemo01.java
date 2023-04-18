package d4_transfer_stream;

import java.io.*;

public class inputStreamReaderDemo01 {
    public static void main(String[] args) {
        // 代碼 UTF-8 ，文件GBK
        try {
            InputStream is = new FileInputStream("C:\\Users\\user\\OneDrive\\桌面\\新文字文件1.txt");
            //Reader isr = new InputStreamReader(is);
            Reader isr = new InputStreamReader(is, "GBK");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
