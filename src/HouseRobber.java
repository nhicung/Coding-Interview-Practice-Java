/*
DESCRIPTION:

	You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
	
	Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
	
	Example 1:
	
	Input: [1,2,3,1]
	Output: 4
	Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
	             Total amount you can rob = 1 + 3 = 4.
	Example 2:
	
	Input: [2,7,9,3,1]
	Output: 12
	Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
	             Total amount you can rob = 2 + 9 + 1 = 12.

SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
	Memory Usage: 34 MB, less than 100.00% of Java online submissions for House Robber.
 */
public class HouseRobber {

	public int rob(int[] nums) {
		
		// check out 2 special case: when nums does not have any value and when nums has 1 value
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		
		// make an int array to keep track of the distinct ways to rob the houses
		// the array has the same length as nums and starting with 0, following with the max value to between the first two house.
		// go through for loop and update each value in the array by comparing the value right before it and 
		// the sum of value at the same index in nums + the value 2 position before it in array cache. 
		// Put the bigger value in to cache. 
		// The last int of array cache is the number we need to find.
		int[] cache = new int[nums.length];
		cache[0] = 0;
		cache[1] = Math.max(nums[0], nums[1]);
		
		for (int i = 1; i < cache.length; i++) {
			cache[i] = Math.max(cache[i-1], nums[i] + cache[i-2]);
		}
		return cache[cache.length -1];
	}
}
