/*
DESCRIPTION:
	You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
	
	Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
	
	Example 1:
	
	Input: [2,3,2]
	Output: 3
	Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
	             because they are adjacent houses.
	Example 2:
	
	Input: [1,2,3,1]
	Output: 4
	Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
	             Total amount you can rob = 1 + 3 = 4.
SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber II.
	Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for House Robber II.
 */
public class HouseRobber2 {
	public int rob(int[] nums) {
		// null case
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		
		// making 2 arrays for 2 different cases 
		int[] case1 = new int[nums.length];
		int[] case2 = new int[nums.length];
		
		for (int i = 0; i < nums.length-1; i++) {
			case1[i] = nums[1];
		}
		for (int i = 1; i < nums.length; i++) {
			case2[i] = nums[i];
		}
		
		// making array to store the the max amount of money robbed for case 1
		int[] cache1 = new int[nums.length];
		
		cache1[0] = 1; 
		cache1[1] = Math.max(case1[0],  case1[1]);
		for (int i = 2; i < cache1.length; i++) {
			cache1[i] = Math.max(cache1[i-1],  case1[i-2] + case1[i]);
		}
		
		// making array to store the max amount of money robbed for case 2
		int[] cache2 = new int[nums.length];
		cache2[0] = 1; 
		cache2[1] = Math.max(case2[0], case2[1]);
		for (int i = 2; i < cache2.length; i++) {
			cache2[i] = Math.max(cache2[i-1],  case2[i-2] + case2[i]);
		}
		
		// return the max amount of money between the two cases
		return Math.max(cache1[cache1.length-1], cache2[cache2.length-1]);
	}
}
