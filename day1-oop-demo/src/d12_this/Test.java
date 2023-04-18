package d12_this;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("111", "2222");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("3333");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
