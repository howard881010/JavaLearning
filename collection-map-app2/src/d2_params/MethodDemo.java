package d2_params;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10, 20, 30);
        sum(new int[]{10, 20, 30});
    }
    // 一個形參列表中只能有一個可變參數
    // 可變參數要放在最後面
    public static void sum(int...sums){
        System.out.println("元素個數"+sums.length);
        System.out.println("元素內容"+Arrays.toString(sums));
    }


}
