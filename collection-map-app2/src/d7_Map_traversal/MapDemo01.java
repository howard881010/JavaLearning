package d7_Map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Iphone", 10);
        maps.put("IphoneA", 12);
        maps.put("IphoneB", 22);
        maps.put("Samsung", 23);
        System.out.println(maps);

        Set<String> keys = maps.keySet();

        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(value);
        }
    }
}
