package d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo01 {
    public static void main(String[] args) throws Exception {
        try (
                Reader fr = new FileReader("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {

//            char[] buffer = new char[1024];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                String rs = new String(buffer, 0, len);
//                System.out.println(rs);
//            }
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
