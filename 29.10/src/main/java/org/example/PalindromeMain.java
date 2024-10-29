package org.example;

public class PalindromeMain {
    public static void main(String[] args) {

        //boolean res = isPalindrome(-10);
        //System.out.println(res);

        System.out.println(addBinary("1111", "1111"));
    }

    /**
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * <p>
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * <p>
     * 123 -> 321
     * 123321 -> 123321
     */
    public static boolean isPalindrome(int original) {
        int reversed = 0;
        int x = original;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }

    /**
     * Input: a = "11", b = "1"
     * Output: "100"
     * <p>
     * 0 + 0 = 0
     * 0 + 1 = 1
     * 1 + 1 = 0 (добавляем в след разряд 1)
     */
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || add == 1) {
            int sum = add;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            if (sum >= 2) {
                add = 1;
            } else {
                add = 0;
            }
            sb.append(sum % 2);
        }
        return sb.reverse().toString();
    }
}
