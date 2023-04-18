package d9_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
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
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    // 重寫equals

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student) {
//            // 要先進行強轉類型
//            Student s2 = (Student) obj;
//            if (this.name.equals(s2.name) && this.age== s2.age && this.sex == s2.sex) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } else {
//            return false;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }
}
