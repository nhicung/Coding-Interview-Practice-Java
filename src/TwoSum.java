/*
DESCRIPTION:
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	Example:
	
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
SOLUTION:
Runtime: 3 ms, faster than 50.20% of Java online submissions for Two Sum.
Memory Usage: 37.3 MB, less than 98.95% of Java online submissions for Two Sum.
 */

import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int secondInt = target - nums[i];
			if (map.containsKey(secondInt) && map.get(secondInt) != i) {
				result[0] = map.get(secondInt);
				result[1] = i;
			}
		}
		return result;
	}
}
