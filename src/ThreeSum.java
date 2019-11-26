/*
DESCRIPTION:
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

SOLUTION:
Runtime: 41 ms, faster than 40.69% of Java online submissions for 3Sum.
Memory Usage: 48.2 MB, less than 81.62% of Java online submissions for 3Sum.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		// sort the given array and create a list of lists to store the result
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // make a for loop to check each value of the array, up to the second last value
        // check the sum of the value right after the checked value and the last value of the list to, 
        // if the sum of that total and and the current checked value is 0 then we add them three to the a list
        // and update result. If not, keep going and narrow down the range by updating the last value to the left
        // and the value next to current checked vallue to the right
        for (int i = 0; i < nums.length-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int lo = i+1;
                int hi = nums.length-1;
                int sum = 0 - nums[i];
                while (lo < hi){
                    if (sum == nums[lo] + nums[hi]){
                        result.add(Arrays.asList(nums[lo],nums[hi],nums[i]));
                        // eliminate cases when there are duplicated values
                        while (lo < hi && nums[lo] == nums[lo+1]){
                            lo ++;
                        }
                        while (lo < hi && nums[hi] == nums[hi-1]){
                            hi --;
                        }
                        lo++;
                        hi--;
                    }
                    else if (sum > nums[lo] + nums[hi]){
                        if (lo < hi && nums[lo] == nums[lo+1]){
                            lo++;
                        }
                        lo++;
                    }
                    else {
                        if (lo < hi && nums[hi] == nums[hi-1]){
                            hi--;
                        }
                        hi--;
                    }
                }    
            }
        }
        return result;
    }
}
