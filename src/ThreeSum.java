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

import java.util.Arrays;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int lo = i+1;
                int hi = nums.length-1;
                int sum = 0 - nums[i];
                while (lo < hi){
                    if (sum == nums[lo] + nums[hi]){
                        result.add(Arrays.asList(nums[lo],nums[hi],nums[i]));
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
        char c1 = 'A';
        char c2 = 'B';
        String s = "AAABBBBB"; 
        int x = 0; 
        int y = 0; 
        for ( int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c1 ){
                x++;
            } else if ( s.charAt(i) == c2){
                y++;
            }
        }
        System.out.println(x==y);
        return result;
    }
}
