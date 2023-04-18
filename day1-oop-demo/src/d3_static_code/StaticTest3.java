package d3_static_code;


import java.util.ArrayList;

public class StaticTest3 {
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"愛心", "黑桃", "方塊", "梅花"};

        for (int i = 0; i < sizes.length; i++) {
            for (int i1 = 0; i1 < colors.length; i1++) {
                String card = sizes[i] + colors[i1];
                cards.add(card);
            }
        }
        // 0

    }

    public static void main(String[] args) {
        // 初始化54張牌
        System.out.println(cards);
    }
}
