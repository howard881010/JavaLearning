package d8_exception_handle_runtime;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("請您輸入合法的價格: ");
                String priceStr = sc.nextLine();
                double price = Double.valueOf(priceStr);

                if (price > 0) {
                    System.out.println("定價: " + price);
                    break;
                } else {
                    System.out.println("價格必須是正數");
                }
            } catch (NumberFormatException e) {
                System.out.println("數據的輸入有毛病");
                throw new RuntimeException(e);
            }

        }
    }
}
