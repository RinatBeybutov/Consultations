import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ПРимитивы
        int a = 2;
        char ch = 'a';
        double b = 2.0;

        // Объекты
        String str = "string";

        // КЛассы - обертки
        Integer intClass = 2;

        //Double
        //Character

        testSort();

        cashier();

        enterMinusOne();

        Cat cat = new Cat();
        int result = cat.countDifficultNumbers(524, 649);

        System.out.println(result);
    }

    private static void testSort() {
        // Ctrl + P
        int [] array = new int[]{5,1,0,10,3};

        // Alt + enter
        //
        long start = System.nanoTime();
        Arrays.sort(array);
        //sortArray(array);

        long end = System.nanoTime();

        long duration = end - start;

        System.out.println("Длительность - " + duration);

        System.out.println(Arrays.toString(array));
    }

    private static void enterMinusOne() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int number;

        do {
            number =  scanner.nextInt();
            sum += number; // <-> sum = sum + number

        } while (number != -1);

        System.out.println(sum);
    }

    private static void cashier() {
        int bank = 5;
        //int count = 2;

        float c = 1.0f * bank / 2;

        /**
         * Шаг 1:
         * Вычисление (int) bank | (int) 2 = 2
         * Шаг 2:
         * Присвоить переменной с значение 2
         */

        //2.5 -> 2

        //byte -> int -> long -> float -> double

        double d = (int)2.5;

        System.out.println(d);
    }

    private static void sortArray(int[] array) {
        /**
         * 5,1,0,10,3,2
         * 1,5,0,10,3,2
         * 1,0,5,10,3,2
         * 1,0,5,3,10,2
         * 1,0,5,3,2,10
         *
         */

        //int count = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                //count++;
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            //System.out.println(Arrays.toString(array));
        }
        //System.out.println("Количество проходов - " + count);
    }


}