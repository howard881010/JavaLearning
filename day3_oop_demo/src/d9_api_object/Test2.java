package d9_api_object;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("aaa", '南', 19);
        Student s1 = new Student("aaa", '南', 19);
        System.out.println(s.equals(s1));
    }
}
