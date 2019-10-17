

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
	public int longestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int result = 0;
		for (int i = 0, j = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(s.charAt(j), i);
			}
			result = j - i + 1;
		}
		return result;
	}

}
