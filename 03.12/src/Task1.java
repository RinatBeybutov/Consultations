import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        // Integer = int
        // -128 ... 127 - берутся из кэша
        Integer a = 120;

        Integer b = 120;
        Integer c = 130;
        Integer d = 130;

        System.out.println(a.equals(b)); // true
        System.out.println(c.equals(d)); // false

        /*Object a1 = new Object(), b1 = new Object();

        System.out.println(a1 > b1);

        // Автоматичеcки Integer a -> int a
        System.out.println(a > c);
*/



    }


    /**
     * 1. Запихнули все буквы в массив, каждая буква под своим номером.
     * 2. По номеру ячейки можем получить букву?
     *
     */
    public static int titleToNumber(String columnTitle) {
        // Генерация массива char из строки
        char[] symbols = columnTitle.toCharArray();
        int result = 0;
        // Перебираем все символы в обратном порядке
        for (int i = symbols.length - 1, n=0; i >= 0; i--, n++) {
            // Переводим код буквы в число
            int currentNum = symbols[i] - 64;
            result = result + (int)Math.pow(26, n) * currentNum;
        }
        return result;
    }

    public static int test(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }

    /**
     * Given a string columnTitle that represents the column title as appears in an Excel sheet,
     * return its corresponding column number.
     *
     * For example:
     *
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * AZ
     *
     * ...
     *
     * Example 1:
     *
     * Input: columnTitle = "A"
     * Output: 1
     *
     * Example 2:
     *
     * Input: columnTitle = "AB"
     * Output: 28
     *
     * Example 3:
     *
     * Input: columnTitle = "ZY"
     * Output: 701
     */
}
