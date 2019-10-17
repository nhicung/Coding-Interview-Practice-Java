/*
 PROBLEM DESCRIPTION
 	Given an array of integers, find if the array contains any duplicates.

	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
	
	Example 1:
	
	Input: [1,2,3,1]
	Output: true
	Example 2:
	
	Input: [1,2,3,4]
	Output: false
	Example 3:
	
	Input: [1,1,1,3,3,4,3,2,4,2]
	Output: true
 	
 MY SOLUTION
 	Runtime: 5 ms, faster than 93.44% of Java online submissions for Contains Duplicate.
	Memory Usage: 41.6 MB, less than 99.14% of Java online submissions for Contains Duplicate.

 */



import java.util.Arrays;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		int j = 1;
		while (j < nums.length) {
			if (nums[i] == nums[j]) {
				return true;
			}
			i++;
			j++;
		}
		return false;
	}
}
