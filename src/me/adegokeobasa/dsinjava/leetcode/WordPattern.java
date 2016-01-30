package me.adegokeobasa.dsinjava.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by epapa on 30/01/2016.
 */
public class WordPattern {

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("adbd", "dog fish cat fish"));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");

        if (pattern == null || pattern.length() == 0 || pattern.length() != words.length) {
            return false;
        }

        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> letters = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String letter = pattern.charAt(i) + "";
            if((map.containsKey(words[i]) && !map.get(words[i]).equalsIgnoreCase(letter)) || (letters.containsKey(letter) && !letters.get(letter).equalsIgnoreCase(words[i]))) {
                return false;
            } else {
                map.put(words[i], letter);
                letters.put(letter, words[i]);
            }
        }
        return true;
    }
}
