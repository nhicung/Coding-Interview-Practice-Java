package singleNumber;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			int c = nums[i];
			if (!map.containsKey(c)) {
				map.put(c, 0);
			}
			map.put(c, map.get(c) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 2) {
				result = entry.getKey();
			}
		}
		return result;
	}
}
