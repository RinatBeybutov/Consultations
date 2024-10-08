import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //task1();
        //task2();
        //task4();
        //task5();

        var a = new int[] {2,3,1,1,1,4,4};
        var r = getMaxRepetetiveNumber(a);
        System.out.println(r);
    }

    private static int getMaxRepetetiveNumber(int[] array) {
        Map<Integer, Integer> numberToCount = new HashMap<>();
        int maxCount = 0;
        int maxRepeatableValue = 0;
        for(int num : array) {
            if(numberToCount.containsKey(num)) {
                Integer lastCount = numberToCount.get(num);
                numberToCount.put(num, lastCount+1);
                if(maxCount < lastCount +1 ) {
                    maxCount  = lastCount +1;
                    maxRepeatableValue = num;
                }
            } else {
                numberToCount.put(num, 1);
            }
        }
        return maxRepeatableValue;
    }

    private static void task5() {
        String str1 = "ABC";
        String str2 = new String("ABC");
        String str3 = "abc";

        System.out.println(str1 == str2);  //false
        System.out.println(str1.equals(str2));  //true

        String str4 = str1 + str3; // конкатенация
        String str5 = "ABCabc";
        System.out.println(str4 == str5);  //false
    }

    private static void task4() {
        ArrayList<Integer> arr  = new ArrayList<>();

        for (int i=0; i< 100_000; i++) {
            arr.add(i);
        }

        long sum= 0;

        for(Integer i : arr) {
            sum += (long)i;
        }

        System.out.println(sum);
    }


    private static long task3() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    private static void task2() {
        Integer e = 500;
        Integer f = 500;
        System.out.println( e == f );

        long dd = 0;
    }

    private static void task1() {
        /**
         * Что выведет код?
         * int a = Integer.MAX_VALUE;
         * int b = 1;
         * long c = a + b;
         */

        /*byte a = 0;

        for (int i = 0; i < 1000; i++) {
            byte test = (byte) i;
            System.out.println(String.format("i - %d, byte - %d",i, test));
        }*/

        int a = Integer.MAX_VALUE;
        int b = 1;
        long c = a + b; // c = Integer.MIN_VALUE

        System.out.println(c);

        /**
         * Почитать ядерный ганди в civilation 6
         */
    }
}