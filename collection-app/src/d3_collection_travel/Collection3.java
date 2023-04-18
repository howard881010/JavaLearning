package d3_collection_travel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Collection3 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("aaa");
        lists.add("bb");
        lists.add("cc");
        lists.add("ddd");
        lists.add("eee");

        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        lists.forEach(s -> System.out.println(s));
        lists.forEach(System.out::println);

    }
}
