package d10_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "2222";
        //System.out.println(s1.equals(s2)); // 留下隱患
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.isNull(s1));
    }
}
