package d7_reflect_framework;

public class ReflectDemo {
    public static void main(String[] args) {
        Student s = new Student("豬八戒", '男', 10000, "西天跑路1班", "吃、睡");
        MyBatisUtil.save(s);

        Teacher t = new Teacher("播妞", '女', 10000);
        MyBatisUtil.save(t);


    }
}
