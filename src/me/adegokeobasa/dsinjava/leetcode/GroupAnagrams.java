package me.adegokeobasa.dsinjava.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by epapa on 19/02/2018.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
//        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> groups = new ArrayList<>();
//
//        ArrayList<String> anagrams = new ArrayList<>();
//        anagrams.add(strs[0]);
//        int lastNonAnagramIndex = 0;
//        int index = 1;
//
//        for (int i = lastNonAnagramIndex + 1; i < strs.length; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }
//        return groups;
//    }

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
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }
}
