package d6_char_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
    }
}
