package me.adegokeobasa.dsinjava.leetcode;

import java.util.Arrays;

/**
 * Created by epapa on 22/01/2016.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5, 6, 6}));
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicatesSubOptimal(new int[]{1, 1, 1, 2}));
    }

    public int removeDuplicatesSubOptimal(int[] nums) {
        int duplicates = 0;

        int backwardPointer = nums.length;
        for (int i = 0; i < nums.length; i++) {

            if (i > 0) {
                while (nums[i] == nums[i - 1]) {
                    duplicates++;
                    moveTo(nums, i, backwardPointer - 1);
                    backwardPointer--;
                    if (nums.length - duplicates == i) {
                        break;
                    }
                }

                if (nums.length - duplicates == i) {
                    break;
                }
            }
        }
        return nums.length - duplicates;
    }

    private void moveTo(int[] nums, int origin, int destination) {
        int originElement = nums[origin];

        int index = origin;
        while (index < destination) {
            nums[index] = nums[index + 1];
            index++;
        }
        nums[destination] = originElement;
    }

    public int removeDuplicates(int[] nums) {

        int forwardPointer1 = 0;

        for (int forwardPointer2 = 1; forwardPointer2 < nums.length; forwardPointer2++) {
            if (nums[forwardPointer2] != nums[forwardPointer1]) {
                nums[++forwardPointer1] = nums[forwardPointer2];
            }
        }
        return forwardPointer1 + 1;
    }
}
