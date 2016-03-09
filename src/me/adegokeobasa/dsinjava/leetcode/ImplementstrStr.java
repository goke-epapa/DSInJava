package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 09/03/2016.
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        System.out.println(new ImplementstrStr().strStr("Adegoke", "goked"));
    }
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
