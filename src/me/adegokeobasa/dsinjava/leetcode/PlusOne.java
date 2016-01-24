package me.adegokeobasa.dsinjava.leetcode;

import java.util.*;

/**
 * Created by epapa on 20/01/2016.
 */
public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9})));
    }

    //TODO Check https://leetcode.com/discuss/58149/my-simple-java-solution
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0)
            return digits;

        ArrayList<Integer> list = new ArrayList<Integer>();

        int elementToAdd = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
            int newElem = digits[i] + elementToAdd;

            elementToAdd = 0;
            if(newElem > 9) {
                elementToAdd = 1;
                newElem = 0;
            }
            list.add(newElem);
        }

        if(elementToAdd == 1) {
            list.add(elementToAdd);
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            result[list.size() - i - 1] = list.get(i);
        }

        return result;
    }
}
