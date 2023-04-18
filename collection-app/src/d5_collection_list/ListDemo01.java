package d5_collection_list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // 不能用collection，沒提供索引功能
        list.add("add");
        list.add("Java");
        list.add("add");
        list.add(2, "2222");

        list.remove(1);
        System.out.println(list.get(1));
        list.set(1, "3333");
    }
}
