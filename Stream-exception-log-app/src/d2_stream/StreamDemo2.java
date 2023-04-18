package d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        // Collection
        Collection<String> list = new ArrayList<>();
        Stream<String > s = list.stream();

        // Map
        Map<String, Integer> maps = new HashMap<>();
        // key
        Stream<String> keyStream = maps.keySet().stream();
        // Value
        Stream<Integer> valueStream = maps.values().stream();
        // Key-Value
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

        // 數組
        String[] names = {"aaa", "bbb", "ccc"};
        Stream<String > nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
