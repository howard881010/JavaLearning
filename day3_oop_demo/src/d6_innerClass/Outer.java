package d6_innerClass;

public class Outer {
    public class inner{
        private String name;
        public static int a;



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            inner.a = a;
        }
    }
}
