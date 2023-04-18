package d5_serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) {
        Student s = new Student("陳磊", "CCCC", "11111", 31);

        // 對象序列化
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"));
        ) {

            oos.writeObject(s);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
