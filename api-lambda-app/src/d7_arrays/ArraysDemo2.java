package d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 默認生序排序
        Integer[] ages = {32, 12, 55, 33, 90};
        //Arrays.sort(ages);
        // 只能支持引用類型的排序
        Arrays.sort(ages, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }

        });
        System.out.println(Arrays.toString(ages));

        System.out.println("-------------");
        Student[] students = new Student[3];
        students[0] = new Student("aaa", 22, 180.5);
        students[1] = new Student("bbb", 26, 150.2);
        students[2] = new Student("ccc", 24, 160.3);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge() - o2.getAge();  //升序排序
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
