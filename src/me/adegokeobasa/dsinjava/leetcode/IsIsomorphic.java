package me.adegokeobasa.dsinjava.leetcode;

import java.util.HashMap;

/**
 * Created by epapa on 30/01/2016.
 */
public class IsIsomorphic {

    public static void main(String[] args) {
        System.out.println(new IsIsomorphic().isIsomorphic("abb", "fgg"));
    }

    /**
     * Optimal Solution
     * No need to check the first element, since a one letter string is isomorphic to every one letter string
     * Start checking from 1
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.indexOf(s.charAt(i), i + 1) != t.indexOf(t.charAt(i), i + 1)) {
                return false;
            }
        }
        return true;
    }


    public boolean isIsomorphicSubOptimal(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[] tChars = t.toCharArray();
        char[] sChars = s.toCharArray();

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < tChars.length; i++) {
            if ((sMap.containsKey(sChars[i]) && !(sMap.get(sChars[i]) == tChars[i])) || (tMap.containsKey(tChars[i]) && !(tMap.get(tChars[i]) == sChars[i]))) {
                return false;
            } else {
                sMap.put(sChars[i], tChars[i]);
                tMap.put(tChars[i], sChars[i]);
            }
        }
        return true;
    }
}
