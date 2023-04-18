package d6_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo1 {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"));
            PrintStream ps1 = new PrintStream("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt");

            ps.println(97);
            ps.println(true);
            ps.println("我是打印流");
            ps.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
