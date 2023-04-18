package d7_Map_traversal;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Iphone", 10);
        maps.put("IphoneA", 12);
        maps.put("IphoneB", 22);
        maps.put("Samsung", 23);
        System.out.println(maps);

        for (Map.Entry<String, Integer> stringIntegerEntry : maps.entrySet()) {
            String key = stringIntegerEntry.getKey();
            int value = stringIntegerEntry.getValue();
            System.out.println(key + "====>" + value);
        }

    }
}
