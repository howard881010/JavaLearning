package d7_abstract_test;

public class GoldCard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("您當前消費" + money);
        System.out.println("你卡片當前餘額是: " + getMoney());

        double rs = money * 0.8;
        System.out.println("您實際支付: " + rs);
        setMoney(getMoney() - rs);
    }
}
