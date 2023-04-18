package d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        list.add("aaa");
        list.add("ddd");
        list.add("aaaa");

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("a");
//            }
//        });
        System.out.println("-------------filter-----------------");
        list.stream().filter(s -> s.startsWith("a")).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);
        System.out.println("-------------limit-----------------");
        list.stream().filter(s -> s.startsWith("a")).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("a")).limit(2).forEach(System.out::println);
        System.out.println("-------------skip-----------------");
        list.stream().filter(s -> s.startsWith("a")).skip(2).forEach(System.out::println);
        System.out.println("-------------Map加工-----------------");
        // 給集合前面加字
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "黑馬的" + s;
//            }
//        });
        list.stream().map(s -> "黑馬的" + s).forEach(System.out::println);
        System.out.println("-------------把所有的名稱放進去學生對象-----------------");
        //list.stream().map(s -> new Student(s)).forEach(System.out::println);
        list.stream().map(Student::new).forEach(System.out::println);

        System.out.println("-------------合併流-----------------");
        Stream<String> s1 = list.stream().filter(s->s.startsWith("a"));
        Stream<String> s2 = Stream.of("Java1", "Java2");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);



    }
}
