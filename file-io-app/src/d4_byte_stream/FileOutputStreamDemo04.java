package d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo04 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");  // 先清空，在重寫
        OutputStream os1 = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt", true);  // 追加


        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes()); //換行
        byte[] buffer = {'a', 97, 98, 99};
        //os.write(buffer);
        os.write(buffer, 0, 3);
        os.write("\r\n".getBytes()); //換行


        byte[] buffer2 = "我是台灣人".getBytes();
        os.write(buffer2);

        // os.flush();
        os.close();   //包含flush



    }
}
