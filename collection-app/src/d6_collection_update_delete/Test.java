package d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

        // 可以，但要從後面開始，才不會漏掉
        for (int i = lists.size() - 1; i >= 0; i--) {
            String ele = lists.get(i);
            if ("Java".equals(ele)) {
                lists.remove(ele);
            }
        }
        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            System.out.println(ele);
        }

//        Iterator<String> iterator = lists.iterator();
//        while (iterator.hasNext()) {
//            String ele = iterator.next();
//            if ("java".equals(ele)) {
//                iterator.remove();
//            }
//        }
        // foreach不能刪除
//        for (String list : lists) {
//            if ("java".equals(list)) {
////                
////          }
//        }
        // lambda也不能刪除
        lists.forEach(s-> System.out.println(s));

    }
}
