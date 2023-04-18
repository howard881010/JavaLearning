package d2_stream;

//體驗Stream

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "張信", "張無忌", "無憂", " 張敏");
        System.out.println(names);

//        List<String> zhangList = new ArrayList<>();
//        for (String name : names) {
//            if(name.startsWith("張")) {
//                zhangList.add(name);
//            }
//        }
//
//        System.out.println(zhangList);
//
//        List<String> zhangThreeList = new ArrayList<>();
//        for (String name : names) {
//            if(name.length() == 3) {
//                zhangThreeList.add(name);
//            }
//        }
//
//        System.out.println(zhangThreeList);


        // 3. Stream
        names.stream().filter(s->s.startsWith("張")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));
    }
}
