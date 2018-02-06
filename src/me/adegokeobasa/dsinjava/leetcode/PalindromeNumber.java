package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 06/02/2018.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int length = (int) Math.log10(x);
        for (int i = 0; i < length; i++) {
            int leftSide = (int) (x / (Math.pow(10, ((int) length - (2 * i)))));
            int rightSide = x % 10;
            if (leftSide != rightSide) {
                return false;
            }
            x = (x - (leftSide * (int) Math.pow(10, ((int) length - (2 * i))))) / 10;
            if (x < 0) {
                break;
            }
        }
        return true;
    }
}
