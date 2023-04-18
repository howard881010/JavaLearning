package d6_char_Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo03 {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");

        fw.write(98);
        fw.write('a');
        fw.write('徐');
        fw.write("\r\n");

        fw.write("abc");
        char[] chars = "aaaaaaadadas".toCharArray();
        fw.write(chars);
        fw.write("\r\n");

        fw.write("aaaaaaadsd", 0, 5);
        fw.write("\r\n");

        fw.write(chars, 3, 5);
        fw.write("\r\n");

        //fw.flush();
        fw.close();

    }
}
