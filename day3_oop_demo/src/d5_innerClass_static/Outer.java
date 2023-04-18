package d5_innerClass_static;

public class Outer {
    private String hobby;
    public static int a = 100;
    public static class inner {
        private String name;
        private int age;
        public static String schoolName;
        public void show() {
            System.out.println(a);
            //System.out.println(hobby);
            Outer o = new Outer();
            System.out.println(o.hobby);
        }
    }
}
