/*

SOLUTION:
	Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
	
	Example 1:
	
	Input: [2,3,-2,4]
	Output: 6
	Explanation: [2,3] has the largest product 6.
	Example 2:
	
	Input: [-2,0,-1]
	Output: 0
	Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
DESCRIPTION:
	Runtime: 1 ms, faster than 98.74% of Java online submissions for Maximum Product Subarray.
	Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Maximum Product Subarray.

 */
package maximumProductSubarray;

public class MaximumProductSubarray {
	public int maxProduct (int[]nums) {
		int result = Integer.MIN_VALUE;
		int curMin = 0; 
		int curMax = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				int temp = curMin; 
				curMin = curMax; 
				curMax = temp;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			curMin = Math.min(nums[i], curMin*nums[i]);
			curMax = Math.max(nums[i], curMax*nums[i]);
			result = Math.max(result, curMax);
		}
		return result;
	}
}
