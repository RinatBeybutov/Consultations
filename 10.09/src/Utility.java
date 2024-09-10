public class Utility {

    /**
     * Написать утилитный класс, который содержит методы
     * а. Проверяет, делится ли входное число на 2
     * б. Возвести число в квадрат
     * в. Нахождения минимального числа из двух чисел
     * г. Возвести входное число в данную степень, задаем число и степень!
     */

    //isValid
    //isPositive

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int squareOfNumber(int number) {
        //number *= 2; - > number = number * 2 ;
        return number * number;
    }

    public static int min(int value1, int value2) {
        if(value1 < value2) {
            return value1;
        }
        return value2;
    }

    public static int degree(int number, int degree) {

        int result = 1;

        for (int i = 0; i < degree; i++) {
            result *= number ;
        }

        return result;
    }
}
