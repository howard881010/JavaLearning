package d9_api_object;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("aaa", '南', 19);
        Student s1 = new Student("aaa", '南', 19);
        System.out.println(s.toString());
        System.out.println(s);
    }
}
