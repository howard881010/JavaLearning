package d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // 加東西
        Collections.addAll(names, "aaa", "bbb", "ccc");
        System.out.println(names);

        // 打亂順序
        Collections.shuffle(names);
        System.out.println(names);

        // sort
        Collections.sort(names);
        System.out.println(names);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 20, 25, 30, 63, 32, 25);
        Collections.sort(list);
        System.out.println(list);

    }
}
