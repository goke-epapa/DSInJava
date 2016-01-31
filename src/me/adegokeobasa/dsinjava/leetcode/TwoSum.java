package me.adegokeobasa.dsinjava.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by epapa on 31/01/2016.
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if(map.containsKey(target - element)) {
                return new int[]{map.get(target - element) + 1, i + 1};
            }
            map.put(element, i);
        }
        return new int[]{};
    }
}
