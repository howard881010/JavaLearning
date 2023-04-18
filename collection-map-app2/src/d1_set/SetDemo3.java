package d1_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    // 讓Set集合把重複對象刪除。 先判斷HashValue 在判斷equals
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("aa", 21, '男');
        Student s2 = new Student("aa", 21, '男');
        Student s3 = new Student("abb", 22, '男');

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);

    }
}
