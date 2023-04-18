package d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("HTML");
        System.out.println(list);
        System.out.println(list.add("aaa"));


        //list.clear();
        //System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        System.out.println(list.contains("Java"));
        System.out.println(list.contains("java"));

        System.out.println(list.remove("java"));

        Object[] arrs = list.toArray();
        System.out.println(Arrays.toString(arrs));
    }
}
