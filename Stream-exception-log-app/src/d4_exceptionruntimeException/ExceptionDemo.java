package d4_exceptionruntimeException;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 1. 數組索引越界異常 ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        //System.out.println(arr[3]);

        // 2. 空指針異常 NullPointerException 直接輸出沒有問題，但是調用空指真的變量的功能就會抱錯
        String name = null;
        System.out.println(name);
        //System.out.println(name.length());

        // 3. 類型轉換異常  ClassCastException
        Object o = 23;
        //String s = (String) o;

        // 4. 數字操作異常 ArithmeticException
        //int c = 10 / 0;

        // 5. 數字轉換異常
        String number = "23aabbcc";
        Integer it = Integer.valueOf(number);
        System.out.println(it + 1);



    }
}
