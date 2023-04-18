package d5_serializable;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\IdeaProjects\\io2-app\\src\\出師表.txt"));
            Student s = (Student) is.readObject();
            System.out.println(s);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
