import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Посчитать факториал числа
         *  f(5) = 5*4*3*2*1
         *  f(3) = 3*2*1
         *
         */

        System.out.println(Integer.MAX_VALUE);

        int value = 17;

        // Alt + enter
        // Вызываем этот метод для нашего числа
        int factorial = getFactorial(value);
        int res1 = getFactorial(4);
        int res2 = getFactorial(4);

        System.out.println("Result - " + res1);

        /**
         * Написать утилитный класс, который
         * а. Проверяет, делится ли входное число на 2
         * б.
         */

        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();
        int val2 = scanner.nextInt();

        boolean isEvenNumber = Utility.isEvenNumber(val);

        System.out.println(isEvenNumber);

        int square = Utility.squareOfNumber(val);

        System.out.println(square);

        int min = Utility.min(val, val2);

        System.out.println(min);

        int degree = Utility.degree(2, 10); // 2^10 = 1024

        double pow = Math.pow(2, 10);

        System.out.println(pow);

    }

    // Это метод, в нем написано, что нужно делать
    private static int getFactorial(int value) {
        System.out.println("Я вхожу в метод со значением - " + value);
        // Конечное условие (дно рекурсии)
        if (value == 1) {
            return 1;
        }

        // Вызов самой функции с меньшими значениями

        int result = value * getFactorial(value - 1);

        System.out.println("Я получил результат " + result);

        return result;
    }

}