package me.adegokeobasa.dsinjava.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by epapa on 06/03/2016.
 */
public class BullsAndCows {
    public static void main(String[] args) {
        System.out.println(new BullsAndCows().getHint("1123", "0111"));
    }
    public String getHint(String secret, String guess) {
        HashMap<String, Integer> bullCows = new HashMap<>();
        bullCows.put("A", 0);
        bullCows.put("B", 0);

        HashMap<Character, Integer> charLocation = new HashMap<>();
        String string = "0123456789";
        for (int i = 0; i < string.length(); i++) {
            charLocation.put(string.charAt(i), -1);
        }

        for(int i = 0; i < secret.length(); i++) {
            char guessChar = guess.charAt(i);
            int guessCharIndex = secret.indexOf(guessChar, charLocation.get(guessChar) + 1);

            if(secret.charAt(i) == guess.charAt(i)){
                bullCows.put("A", bullCows.get("A") + 1);
                charLocation.put(guessChar, guessCharIndex);
            } else if(secret.contains(guess.charAt(i) + "") && guessCharIndex != -1) {
                bullCows.put("B", bullCows.get("B") + 1);
                charLocation.put(guessChar, guessCharIndex);
            }
        }
        return bullCows.get("A") + "A" + bullCows.get("B") + "B";
    }
}
