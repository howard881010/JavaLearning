package d1_static;

public class Student {
    private String name;
    // 靜態成員方法
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }
    //實例方法
    public void study() {
        System.out.println(name + "在學習");
    }

    public static void main(String[] args) {
        System.out.println(Student.getMax(10, 3));
        System.out.println(getMax(10, 3));


        Student s = new Student();
        s.name = "豬八戒";
        s.study();
        // 可行但不推薦
        s.getMax(10,3);
    }
}
