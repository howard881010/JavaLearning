package d4_transfer_stream;

import java.io.*;

public class outputStreamWriterDemo02 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:\\Users\\user\\OneDrive\\桌面\\新文字文件1.txt");
            //Writer osw = new OutputStreamWriter(os);
            Writer osw = new OutputStreamWriter(os, "GBK");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("我愛台灣");
            bw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
