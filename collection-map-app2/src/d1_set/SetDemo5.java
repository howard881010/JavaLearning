package d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    // TreeSet排序，自定義類型排序
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(23);
        sets.add(21);
        sets.add(25);
        sets.add(22);
        sets.add(26);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>();
        sets1.add("a");
        sets1.add("b");
        sets1.add("A");
        sets1.add("1");
        System.out.println(sets1);

//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                //return o1.getWeight() - o2.getWeight();  // 升序
//                //return o2.getWeight() - o1.getWeight();  // 降序
//                // 比較浮點數
//                return Double.compare(o2.getWeight(), o1.getWeight());
//
//            }
//        });
        Set<Apple> apples = new TreeSet<>((Apple o1, Apple o2) -> Double.compare(o2.getWeight(), o1.getWeight()));

        apples.add(new Apple(22.8, 20));
        apples.add(new Apple(15.9, 200));
        apples.add(new Apple(2.8, 250));
        apples.add(new Apple(221.8, 208));
        System.out.println(apples); //需要排序
    }
}
