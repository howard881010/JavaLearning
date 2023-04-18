package d7_Map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Iphone", 10);
        maps.put("IphoneA", 12);
        maps.put("IphoneB", 22);
        maps.put("Samsung", 23);
        System.out.println(maps);

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + "======>" + integer);
//            }
//        });
        maps.forEach((String s, Integer integer) ->{
                System.out.println(s + "======>" + integer);

        });

    }
}
