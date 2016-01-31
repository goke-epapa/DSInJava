package me.adegokeobasa.dsinjava.leetcode;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by epapa on 31/01/2016.
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{3,2,3}));
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            histogram.put(nums[i] , histogram.containsKey(nums[i]) ? histogram.get(nums[i]) + 1 : 1);
        }

        Set<Integer> enumeration = histogram.keySet();

        int largestFrequency = Integer.MIN_VALUE;
        int largestElem = Integer.MIN_VALUE;
        for(Integer integer : enumeration) {
            int frequency = histogram.get(integer);
            if(frequency > largestFrequency) {
                largestFrequency = frequency;
                largestElem = integer;
            }
        }

        return largestElem;
    }

    /**
     *
     *
     *
     *
     public int majorityElement(int[] num) {

     int major=num[0], count = 1;
     for(int i=1; i<num.length;i++){
     if(count==0){
     count++;
     major=num[i];
     }else if(major==num[i]){
     count++;
     }else count--;

     }
     return major;
     }
     */

    /**
     * Boyer-Moore majority voting algorithm
     * @link https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
     *
     public int majorityElement(int[] nums) {
     int L = nums.length;
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0; i<L; i++) {
     if(map.containsKey(nums[i])) {
     if(map.get(nums[i]) >= L/2)
     return nums[i];
     map.replace(nums[i], map.get(nums[i])+1);
     }
     else
     map.put(nums[i], 1);
     }
     return nums[L-1];
     }
     */
}
