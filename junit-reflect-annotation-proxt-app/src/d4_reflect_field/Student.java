package d4_reflect_field;

public class Student {
    private String name;
    private int age;
    public static String schoolName;
    public static final String COUNTRY = "中國";

    public Student(String name, int age) {
        System.out.println("有參數構造器");
        this.name = name;
        this.age = age;
    }

    public Student() {
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
