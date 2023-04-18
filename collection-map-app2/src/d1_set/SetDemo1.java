package d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //Set<String> sets = new HashSet<>();  //無序
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
