import cats.Cat;
import cats.GreenCat;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {

        /**
         * Boxind и Unboxind - Автоупаковка и автораспаковка
         */

        int a = 5;
        Integer b = Integer.valueOf(5);
        Integer c = 5;
        int d = c;

        GeneralNumber<Integer> myValue = new GeneralNumber<>(3);
        System.out.println(myValue.isIntegerClassInside());


        GeneralNumber<Double> doubleValue = new GeneralNumber<>(Double.valueOf(3.0));
        System.out.println(doubleValue.isIntegerClassInside());

        for (int i = 0; i < 1000; i++) {
            int aa = i;
            System.out.println(aa);
        }

        ArrayList<Integer> list = new ArrayList<>();

        GeneralCat<Cat> geNCat;
        GeneralCat<GreenCat> greenCatGeneralCat;
        //GeneralCat<Dog> dog; - error!
    }
}
