package d1_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<String> sets = new LinkedHashSet<>();  // 有序
        sets.add("Java");
        sets.add("Java");
        sets.add("MYSQL");
        sets.add("MYSQL");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");

        System.out.println(sets);

    }
}
