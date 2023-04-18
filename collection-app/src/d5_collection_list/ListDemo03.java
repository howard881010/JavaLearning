package d5_collection_list;

import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        // 做一個queue
        LinkedList<String> queue = new LinkedList<>();

        queue.addLast("1號");
        queue.addLast("2號");
        queue.addLast("3號");
        System.out.println(queue);

        System.out.println(queue.getFirst());
        System.out.println(queue);

        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        // 做一個stack
        LinkedList<String> stack = new LinkedList<>();
        stack.push("第一顆子彈");  // or addFirst
        stack.push("第二顆子彈");
        stack.push("第三顆子彈");
        stack.push("第四顆子彈");
        System.out.println(stack);

        System.out.println(stack.pop());  // or removeFirst
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
    }
}
