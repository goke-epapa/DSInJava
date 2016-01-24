package me.adegokeobasa.dsinjava.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Objects;

/**
 * Created by epapa on 20/01/2016.
 */
public class ContainsDuplicate {
    /**
     * First Attempt
     * @param nums
     * @return
     */
    public boolean _containsDuplicate(int[] nums) {
        // Create an array that holds found elements
        Hashtable hashtable = new Hashtable();

        for(int i = 0; i < nums.length; i++) {
            Object elem = hashtable.get(nums[i]);
            if(elem != null && ((int) elem > 0)) {
                return true;
            }

            hashtable.put(nums[i], 1);
        }
        return false;
    }

    /**
     * @credits https://leetcode.com/discuss/37219/possible-solutions
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i : nums) {
            if(!hashSet.add(i)) {
                return true;
            }
        }

        return false;
    }
}
