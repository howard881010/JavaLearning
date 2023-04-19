package d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestStudentDemo02 {
    @Test
    public void getDeclaredField() throws Exception {
        Class c = Student.class;
        // 根據名稱定位某個成員變量
        Field ageF = c.getDeclaredField("age");
        // 賦值
        ageF.setAccessible(true);
        Student s = new Student();
        ageF.set(s, 18);
        System.out.println(s);
        // 取值
        int age = (int) ageF.get(s);
        System.out.println(age);
    }
}
