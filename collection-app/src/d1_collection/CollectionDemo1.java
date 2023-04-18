package d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CollectionDemo1 {
    public static void main(String[] args) {
        // 明確collection體系特點
        Collection list = new ArrayList();
        list.add("Java");
        list.add(2);
        list.add(false);
        list.add(false);
        System.out.println(list);

        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add(2);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);

        Collection<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");





    }
}
