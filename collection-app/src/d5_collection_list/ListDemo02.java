package d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");


        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            System.out.println(ele);
        }

        Iterator<String> iterator = lists.iterator();
        while (iterator.hasNext()) {
            String ele = iterator.next();
            System.out.println(ele);
        }

        for (String list : lists) {
            System.out.println(list);
        }

        lists.forEach(s-> System.out.println(s));

    }
}
