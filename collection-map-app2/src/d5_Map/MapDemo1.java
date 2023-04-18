package d5_Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("aa", 3);
        maps.put("bb", 5);
        maps.put("cc", 10);
        maps.put("bb", 10);   //覆蓋前面
        maps.put(null, null);
        System.out.println(maps );

    }
}
