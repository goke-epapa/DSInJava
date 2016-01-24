package me.adegokeobasa.dsinjava.leetcode;

import java.util.Arrays;

/**
 * Created by epapa on 23/01/2016.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int forwardPointer1 = 0;

        for (int forwardPointer2 = 0; forwardPointer2 < nums.length; forwardPointer2++) {
            if (nums[forwardPointer2] != 0) {
                nums[forwardPointer1++] = nums[forwardPointer2];
            }
        }

        for(int i = forwardPointer1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
