package me.adegokeobasa.dsinjava.leetcode;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 * Created by epapa on 23/01/2016.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        if (s.equalsIgnoreCase(t)) {
            return true;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if(sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }

//        Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();
//
//        for (int i = 0; i < sChars.length; i++) {
//            hashtable.put(sChars[i], hashtable.contains(sChars[i]) ? hashtable.get(sChars) + 1 : 1);
//            hashtable.put(tChars[i], hashtable.contains(tChars[i]) ? hashtable.get(tChars) + 1 : 1);
//        }
//
//        Enumeration<Character> keys = hashtable.keys();
//        while (keys.hasMoreElements()) {
//            if(keys.)
//        }
}
