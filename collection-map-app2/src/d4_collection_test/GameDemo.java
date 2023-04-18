package d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {
    // 1. 牌庫
    public static List<Card> allCards = new ArrayList<>();
    // 2. 做牌
    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"梅花", "方塊", "愛心", "黑桃"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size, color, index);
                allCards.add(c);
            }
        }
        // 大小王
        Card c1 = new Card("", "小王", ++index);
        Card c2 = new Card("", "大王", ++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌: " + allCards);
    }
    public static void main(String[] args) {
        // 洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌後: " + allCards);
        // 創建玩家
        List<Card> a = new ArrayList<>();
        List<Card> b = new ArrayList<>();
        List<Card> c = new ArrayList<>();
        // 開始發牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            if(i % 3 == 0) {
                a.add(card);
            } else if (i % 3 == 1) {
                b.add(card);
            } else {
                c.add(card);
            }
        }

        // 拿最後三張底牌(擷取成一個子集合)
        List<Card> lastThreeCards = allCards.subList(allCards.size()-3, allCards.size());

        // 給玩家的牌排序(從大到小)
        sortCards(a);
        sortCards(b);
        sortCards(c);

        // 輸出玩家的牌
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                // 知道牌的大小，才可以指定規劃
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
