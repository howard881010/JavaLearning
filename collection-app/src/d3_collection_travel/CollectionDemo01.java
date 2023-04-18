package d3_collection_travel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("aaa");
        lists.add("bb");
        lists.add("cc");
        lists.add("ddd");
        lists.add("eee");
        Iterator<String> it = lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
