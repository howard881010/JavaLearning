package d3_char_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWritedDemo02 {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("C:\\Users\\user\\IdeaProjects\\file-io-app\\src\\data.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(98);
        bw.write('a');
        bw.write('徐');
        bw.newLine();
        bw.write("abc");
        char[] chars = "aaaaaaadadas".toCharArray();
        bw.write(chars);
        bw.newLine();

        bw.write("aaaaaaadsd", 0, 5);
        bw.newLine();

        bw.write(chars, 3, 5);
        bw.newLine();

        //bw.flush();
        bw.close();

    }
}
