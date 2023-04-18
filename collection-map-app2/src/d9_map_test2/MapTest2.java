package d9_map_test2;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        // 1. 建立map集合，記錄同學選的情況
        Map<String, List<String>> data = new HashMap<>();

        // 2. 把學生選擇的數據存入進去
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "C");
        data.put("羅永", selects);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "B", "C");
        data.put("湖饕", selects1);

        System.out.println(data);

        // 3. 統計每個景點選擇的人數
        Map<String, Integer> infos = new HashMap<>();

        // 4.提取所有人選擇的景點的訊息
        Collection<List<String>> values = data.values();

        for (List<String> value : values) {
            for (String s : value) {
                if(infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                }else {
                    infos.put(s, 1);
                }
            }
        }



    }
}
