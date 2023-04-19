package d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestStudentDemo01 {
    @Test
    public void getDeclaredFields() {
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "=====>" + field.getType());
        }

    }

    @Test
    public void getDeclaredField() throws Exception {
        Class c = Student.class;
        // 根據名稱定位某個成員變量
        Field field = c.getDeclaredField("age");
        System.out.println(field.getName() + "=====>" + field.getType());


    }

}
