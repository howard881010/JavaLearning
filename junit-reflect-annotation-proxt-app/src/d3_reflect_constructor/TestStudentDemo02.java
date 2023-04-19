package d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudentDemo02 {
    @Test
    public void getDeclaredConstructor() throws Exception {
        Class c = Student.class;
        // 提取類中單個的構造器對象
        Constructor constructor = c.getDeclaredConstructor();
        // 遍歷構造器
        System.out.println(constructor.getName() + "=====>" + constructor.getParameterCount());
        // 如果遇到私有構造器，可以暴力反射，將權限打開
        constructor.setAccessible(true);
        Student s = (Student) constructor.newInstance();
        System.out.println(s);


        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor1.getName() + "=====>" + constructor1.getParameterCount());

        Student s1 = (Student) constructor1.newInstance("孫悟空", 1000);
        System.out.println(s1);

    }
}
