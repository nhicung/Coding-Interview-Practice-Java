package twoSum;

import java.util.HashMap;
import java.util.Map;

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
