package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 09/02/2018.
 * @link - https://leetcode.com/problems/count-and-say/description/
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(2));
    }

    public String countAndSay(int n) {
        if (n == 1) return "1";

        int runs = 0;
        String result = "1";
        while (runs < n - 1) {
            String runResult = "";
            runs++;
            char curr = '.';
            int charCount = 0;
            char[] chars = result.toCharArray();
            for (int i = 0; i < result.length(); i++) {
                if (curr != chars[i]) {
                    if (curr != '.') {
                        runResult += String.valueOf(charCount) + curr;
                    }
                    curr = chars[i];
                    charCount = 1;
                } else {
                    charCount++;
                }

                if (i == result.length() - 1) {
                    runResult += String.valueOf(charCount) + curr;
                }
            }
            result = runResult;
        }
        return result;
    }
}
