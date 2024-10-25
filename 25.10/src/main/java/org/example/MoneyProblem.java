package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyProblem {
    public static void main(String[] args) {
        //"0.3" + "0.2"
        float a1 = .2f;
        float a2 = .2f;
        float m3 = 2f/3;
        int kop = 201;
        System.out.println(0.1 + 0.2 == 0.3);

        BigDecimal money = new BigDecimal(2);
        money.divide(BigDecimal.TEN, RoundingMode.HALF_UP);
    }
}
