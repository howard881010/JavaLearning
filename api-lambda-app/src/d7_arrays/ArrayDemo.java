package d7_arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {10, 2, 55, 23, 24};
        System.out.println(arr);
        // 返回數組內容
        String rs = Arrays.toString(arr);
        System.out.println(rs);

        // 排序API
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 二分搜索技術 (前提數組必須排好序)
        int index = Arrays.binarySearch(arr, 55);
        System.out.println(index);
        // 返回:   - (應該插入位置) - 1
        int index1 = Arrays.binarySearch(arr, 555);
        System.out.println(index1);



    }
}
