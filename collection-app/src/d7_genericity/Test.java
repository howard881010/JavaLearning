package d7_genericity;

public class Test {
    public static void main(String[] args) {
        // 模擬arrayList泛型設計
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
    }
}
