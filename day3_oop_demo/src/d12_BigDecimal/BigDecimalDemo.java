package d12_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal a2 = BigDecimal.valueOf(0.2);
        BigDecimal c1 = a1.add(a2);
        System.out.println(c1);

        double rs = c1.doubleValue();

        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal a22 = BigDecimal.valueOf(3.0);
        BigDecimal c2 = a11.divide(a22, 2, RoundingMode.HALF_UP);
        System.out.println(c2.doubleValue());


    }
}
