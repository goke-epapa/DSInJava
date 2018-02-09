package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 09/02/2018.
 * @link https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsert {

    public static void main(String[] args) {
        System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 8}, 0));
    }

    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0 || target < nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                // Found
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }

            if (nums[mid] > target && nums[mid - 1] < target) {
                return mid;
            }
        }
        return high;
    }
}
