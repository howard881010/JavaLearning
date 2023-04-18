package d6_char_Stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");

        //int code = fr.read();
        //System.out.println((char) code);

        int code;

        while ((code = fr.read()) != -1) {
            System.out.println(code);
        }
    }
}
