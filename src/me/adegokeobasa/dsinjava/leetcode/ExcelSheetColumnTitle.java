package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 06/03/2016.
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(52));
    }
    public String convertToTitle(int n) {
        String string = "";

        while (n != 0) {
            char ch = (char) ((n - 1) % 26 + 'A');
            n = (n - 1) / 26;
            string = ch + string;
        }
        return string;
    }
}
