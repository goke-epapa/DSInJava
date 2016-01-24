package me.adegokeobasa.dsinjava.leetcode;

import java.util.Arrays;

/**
 * Created by epapa on 23/01/2016.
 */
public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{1, 2, 3, 4, 5, 8, 5, 6, 7, 9}, 3));
        System.out.println(new RemoveElement().removeElement(new int[]{2, 2, 3}, 2));
    }

    public int removeElement(int[] nums, int val) {

        int forwardPointer1 = 0;

        for (int forwardPointer2 = 0; forwardPointer2 < nums.length; forwardPointer2++) {
            if (nums[forwardPointer2] != val) {
                nums[forwardPointer1++] = nums[forwardPointer2];
            }
        }
        return forwardPointer1;
    }

    public int removeElementSubOptimal(int[] nums, int val) {
        int foundElements = 0;
        boolean found = false;
        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (found) {
                if (nums[i] == val) {
                    foundElements++;
                    continue;
                }
                nums[pointer++] = nums[i];
            }

            if (nums[i] == val) {
                pointer = i;
                found = true;
                foundElements++;
            }
        }
        return nums.length - foundElements;
    }
}
