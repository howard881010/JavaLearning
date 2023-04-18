package d6_Map_API;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Iphone", 10);
        maps.put("IphoneA", 12);
        maps.put("IphoneB", 22);
        maps.put("Samsung", 23);
        System.out.println(maps);

        //maps.clear();
        //System.out.println(maps);

        System.out.println(maps.isEmpty());

        Integer key = maps.get("Iphone");
        System.out.println(key);

        System.out.println(maps.remove("Iphone"));
        System.out.println(maps);

        System.out.println(maps.containsKey("娃娃"));
        System.out.println(maps.containsKey("Samsung"));

        System.out.println(maps.containsValue(23));
        System.out.println(maps.containsValue(100));

        Set<String> keys= maps.keySet();
        System.out.println(keys);

        Collection<Integer> values = maps.values();
        System.out.println(values);

        System.out.println(maps.size());



    }
}
