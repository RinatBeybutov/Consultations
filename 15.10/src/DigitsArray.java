import java.util.Arrays;

public class DigitsArray {
    public static void main(String[] args) {
        int [] input = new int[]{9,9,9,9};
        int[] output = plusOne(input);
        System.out.println(Arrays.toString(output));
    }

    /**
     * Input: digits = [1,9]
     * Output: [2,0]
     * Explanation: The array represents the integer 19.
     * Incrementing by one gives 19 + 1 = 20.
     * Thus, the result should be [2,0].
     */

    /**
     * Цифру в строку - проблема с влезанием в память int
     */
    public static int[] plusOne(int[] digits) {
        int addNum = 1;
        for (int i = digits.length - 1; i >=0; i--) {
            int sum = digits[i] + addNum;
            if(sum > 9) {
                digits[i] = 0;
            } else {
                digits[i] = sum;
                addNum = 0;
            }
        }
        if(digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
