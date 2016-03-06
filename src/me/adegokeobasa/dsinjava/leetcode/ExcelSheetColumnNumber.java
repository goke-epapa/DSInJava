package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 06/03/2016.
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(new ExcelSheetColumnNumber().titleToNumber("AZ"));
    }

    public int titleToNumber(String s) {
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            total += getValue(s.charAt(i), s.length() - 1 - i);
        }
        return total;
    }

    private double getValue(char letter, double position) {
        final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return (int) Math.pow(26.0d, position) * (ABC.indexOf(letter) + 1);
    }
}
