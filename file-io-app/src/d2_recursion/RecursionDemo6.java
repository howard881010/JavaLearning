package d2_recursion;

import java.io.Closeable;

public class RecursionDemo6 {

    public static int totalNumber;
    public static int lastBottleNumber;  // 剩餘瓶子個數
    public static int lastCoverNumber;  // 剩餘蓋子個數


    public static void main(String[] args) {
        buy(10);
        System.out.println("總數: " + totalNumber);
        System.out.println("剩餘瓶子數: " + lastBottleNumber);
        System.out.println("剩餘蓋子數: " + lastCoverNumber);
    }

    private static void buy(int money) {
        int buyNumber = money / 2;
        totalNumber += buyNumber;
        int coverNumber = lastCoverNumber + buyNumber;
        int bottleNumber = lastBottleNumber + buyNumber;

        int allMoney = 0;
        if (coverNumber >= 4){
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;
        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;
        if (allMoney >= 2) {
            buy(allMoney);
        }


    }
}
