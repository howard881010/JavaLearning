package d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Double> lists = List.of(569.5, 700.5, 523.0, 570.5);
        lists.add(689.0);
        System.out.println(lists);

        Set<String> names = Set.of("aaa", "bbb", "ccc");

        Map<String, Integer> maps = Map.of("aaa", 2, "bbb", 2, "cccc", 3);


    }
}
