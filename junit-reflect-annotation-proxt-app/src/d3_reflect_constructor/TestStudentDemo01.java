package d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudentDemo01 {
    @Test
    public void getConstructors(){
        Class c = Student.class;
        // 提取類中全部的構造器對象
        Constructor[] constructors = c.getConstructors();
        // 遍歷構造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "=====>" + constructor.getParameterCount());
        }
    }

    @Test
    public void getDeclaredConstructors(){
        Class c = Student.class;
        // 提取類中全部的構造器對象
        Constructor[] constructors = c.getDeclaredConstructors();
        // 遍歷構造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "=====>" + constructor.getParameterCount());
        }
    }

    @Test
    public void getConstructor() throws Exception {
        Class c = Student.class;
        // 提取類中單個的構造器對象
        Constructor constructor = c.getConstructor();
        // 遍歷構造器
        System.out.println(constructor.getName() + "=====>" + constructor.getParameterCount());

    }

    @Test
    public void getDeclaredConstructor() throws Exception {
        Class c = Student.class;
        // 提取類中單個的構造器對象
        Constructor constructor = c.getDeclaredConstructor();
        // 遍歷構造器
        System.out.println(constructor.getName() + "=====>" + constructor.getParameterCount());

        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor1.getName() + "=====>" + constructor1.getParameterCount());

    }

}
