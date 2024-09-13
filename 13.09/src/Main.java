import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Рекурсия
        /**
         * Дано натуральное число n. Выведите все числа от 1 до n.
         * 10
         * 9
         * 8
         * 7
         * ..
         * 2
         * 1
         */

        //printNumbers(10);

        //int i = sum1(5, 10);

        //System.out.println(i);


        /**
         * Дано натуральное число N. Выведите слово YES, если число N
         * является точной степенью двойки, или слово NO в противном случае.
         * Операцией возведения в степень пользоваться нельзя!
         * 16
         * 2
         * 4
         * 8
         * 16
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int twoInDegree = 2;

        check1(number, twoInDegree);

        /**
         * Задание 1:
         * Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
         * в порядке возрастания, если A < B, или в порядке убывания в противном случае.
         *
         * Задание 2:
         * Дано натуральное число N. Вычислите сумму его цифр.
         * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется)
         */

    }

    // 16 - number, 16 - twoInDegree
    // 15 - number, 16 - twoInDegree
    public static void check(int number, int twoInDegree) {
        // Услоовия окончания
        // п.а Если число является точной степенью двойки
        if (number == twoInDegree) {
            System.out.println("Число является точной степенью двойки!");
            return;
        }
        // п.б Если чиcло не является степенью двойки
        if (number < twoInDegree) {
            System.out.println("Число НЕ ЯВЛЯЕТСЯ степенью двойки!");
            return;
        }

        // Вызов самого себя с новыми параметрами
        check(number, 2*twoInDegree);
    }

    public static void check1(int number, int twoInDegree) {
        if(number > twoInDegree) {
            check1(number, 2*twoInDegree);
        } else if(number == twoInDegree) {
            System.out.println("ТОчная степень");
        } else {
            System.out.println("Неточная степень");
        }
    }

    /**
     *  Рекурсия - вызов метода внутри себя
     * <p>
     *  * Нужно написать условие окончания рекурсии
     *
     */

    public static int sum1(int a, int b) {
        int result = sum2(a, b);

        return result;
    }

    public static int sum2(int c, int d) {
        return c+d;
    }

    public static void printNumbers(int number) {

        // Условие окончания рекурсии
        if(number == 1) {
            return;
        }

        // Вызов самого себя

        printNumbers(number-1);

        System.out.println(number);
    }




}