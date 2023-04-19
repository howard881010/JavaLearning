package d6_reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());

        System.out.println(list1.getClass() == list2.getClass());

        System.out.println("---------------------");
        list2.add(2);
        list2.add(3);
        Class c = list2.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean rs = (boolean) add.invoke(list2, "黑馬");

        System.out.println(rs);
        System.out.println(list2);

        ArrayList list3 = list2;
        list3.add(true);

        System.out.println(list2);


    }
}
