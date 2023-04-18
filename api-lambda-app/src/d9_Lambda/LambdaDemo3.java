package d9_Lambda;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] arr = {11, 22, 33, 58, 44};

        Arrays.sort(arr, (o1, o2)->{
            return o2-o1;
        });
        System.out.println(Arrays.toString(arr));
    }
}
