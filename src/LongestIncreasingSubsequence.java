/*
DESCRIPTION:
	Given an unsorted array of integers, find the length of longest increasing subsequence.
	
	Example:
	
	Input: [10,9,2,5,3,7,101,18]
	Output: 4 
	Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
	Note:
	
	There may be more than one LIS combination, it is only necessary for you to return the length.
	Your algorithm should run in O(n2) complexity.
	Follow up: Could you improve it to O(n log n) time complexity?
SOLUTION:
	Runtime: 8 ms, faster than 63.46% of Java online submissions for Longest Increasing Subsequence.
	Memory Usage: 36.8 MB, less than 74.00% of Java online submissions for Longest Increasing Subsequence.

 */
public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		
		// make an int array to keep track of the maximum length of the subsequence in of nums
		// Starting the array with 1. Go through nested for loop, of which the inner for loop keep
		//track of value from index 0 up to current index of outer for loop.
		// Make an int curMax to keep track of the maximum length so far.
		//If there is value that smaller that the value of current index i, update curMax, then put into 
		// cache. Update result with the max of all curMax.
		int[] cache = new int[nums.length];
		cache[0] = 1;
		int result = 0;
		for (int i = 0; i < cache.length; i++) {
			int curMax = 1;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					curMax = Math.max(curMax,  cache[j] +1);
				}
			}
			cache[i] = curMax;
			result = Math.max(result, curMax);
		}
		return result;
	}
}
