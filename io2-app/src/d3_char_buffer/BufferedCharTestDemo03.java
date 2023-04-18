package d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    完成順序恢復，並存入另一個目標
 */
public class BufferedCharTestDemo03 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表1.txt"));
        ) {
            List<String> data = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "1", "2", "3", "4", "5", "6", "7", "8", "9");
            Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {

                    return sizes.indexOf(o1.substring(0, o1.indexOf("."))) - sizes.indexOf(o2.substring(0, o2.indexOf(".")));
                }
            });

            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }
            System.out.println(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
