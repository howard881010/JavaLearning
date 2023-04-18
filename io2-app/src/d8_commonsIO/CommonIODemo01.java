package d8_commonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonIODemo01 {
    public static void main(String[] args) throws Exception {
        IOUtils.copy(new FileInputStream("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"),
                new FileOutputStream("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表2.txt"));

        FileUtils.copyFileToDirectory(new File("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"),
                new File("D:\\resource"));

        FileUtils.copyDirectoryToDirectory(new File("D:\\resource"), new File("D:\\resource1"));

        FileUtils.deleteDirectory(new File("D:\\resource1"));

        // java 自己的
        Files.copy(Path.of("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"), Path.of("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表3.txt"));
        Files.deleteIfExists(Path.of("D:\\resource"));
    }
}
