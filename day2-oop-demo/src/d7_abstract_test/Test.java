package d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("dlei");
        c.pay(300);
        System.out.println("剩餘: " + c.getMoney());

    }
}
