package d3_reflect_constructor;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        System.out.println("有參數構造器");
        this.name = name;
        this.age = age;
    }

    private Student() {
        System.out.println("無參數構造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
