package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 20/01/2016.
 */
public class AddDigits {

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigitsOptimum(1234567876));
    }

    /**
     * @
     * @param num
     * @return
     */
    public int addDigits(int num) {
        int sum = num;
        int len = String.valueOf(sum).length();

        if(len == 1) {
            return sum;
        }

        do {
            int newSum = 0;
            for(int i = 0; i < len; i++) {
                String number = String.valueOf(sum);
                newSum += Integer.parseInt(number.charAt(i) + "");
            }
            sum = newSum;

            len = String.valueOf(sum).length();
        } while (len > 1);
        return sum;
    }

    /**
     * @concept Digital Roots
     * @credit https://en.wikipedia.org/wiki/Digital_root
     * @credit https://leetcode.com/discuss/80037/java-one-line-simple-answer
     * @param num
     * @return
     */
    public int addDigitsOptimum(int num) {
        // Since the answer is a one digit answer, the maximum number that can be gotten is 9
        // If number is less than 9, return the number
        // If the number is divisible by 9, return 9,
        // else return the remainder of after divided by 9
        return num < 9 ? num : (num % 9 == 0) ? 9 : num % 9;
    }
}
