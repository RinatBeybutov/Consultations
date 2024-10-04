import cats.Cat;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        Shop shop = getShop();

        System.out.println(shop.getCount());

        Predicate<Integer> isPositiveNumber = integer -> integer > 0;
        Predicate<Integer> isOddNumber = integer -> integer %2 == 0;
        Predicate<String> isValidPassword = str -> str.length() > 6 && str.contains("1");

        System.out.println(isPositiveNumber.test(4));
        System.out.println(isPositiveNumber.test(-4));

        Consumer<String> printConsumer = str -> System.out.println(str);
        printConsumer.accept("Вывожу строку в консьюмере");

        Consumer<String> printConsumerMethodReference = System.out::println;
        printConsumerMethodReference.accept("Method reference");

        int a = 5;

        //????
        assert a < 0;

        Comparator<Cat> catComparator = (cat1, cat2) -> cat1.getName().length() - cat2.getName().length();


    }

    /**
     * Функциональные интерфейсы - один метод
     */
    // Через функциональный интерфейс
    public static Predicate<Integer> getPositiveIntegerPredicateTest() {
        return new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
    }

    /*public static Predicate<Integer> getPositiveIntegerPredicate() {
        return integer -> integer > 0;
    }*/

    /**
     * Для нескольких входных переменных
     * (a1, a1 ) -> ...
     */


    /**
     * Анонимные классы
     */
    public static Shop getShop() {
        return new Shop() {
            Cat cat = new Cat("asd");

            @Override
            public int getBasketValue() {
                System.out.println("Cat ...");
                return 10;
            }

            @Override
            public int getCount() {
                return 100;
            }
        };
    }
}
