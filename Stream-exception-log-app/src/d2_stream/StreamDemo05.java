package d2_stream;

// 收集Stream流

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        list.add("aaa");
        list.add("ddd");
        list.add("aaaa");

        Stream<String> str = list.stream().filter(s -> s.startsWith("a"));

        List<String> zhangList = str.collect(Collectors.toList());  // 可變集合
        System.out.println(zhangList);

        List<String> list1 = str.toList();   // 得到一個不可變集合

        Stream<String> str1 = list.stream().filter(s -> s.startsWith("a"));
        Set<String> zhangSet = str1.collect(Collectors.toSet());
        System.out.println(zhangSet);


        Stream<String> str2 = list.stream().filter(s -> s.startsWith("a"));
        Object[] arrs = str2.toArray();
        //String[] arrs = str2.toArray(String[]::new); 可以不管
        System.out.println(Arrays.toString(arrs));


    }
}
