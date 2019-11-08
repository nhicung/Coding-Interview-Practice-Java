/*
DESCRIPTION:
	A message containing letters from A-Z is being encoded to numbers using the following mapping:

	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	Given a non-empty string containing only digits, determine the total number of ways to decode it.
	
	Example 1:
	
	Input: "12"
	Output: 2
	Explanation: It could be decoded as "AB" (1 2) or "L" (12).
	Example 2:
	
	Input: "226"
	Output: 3
	Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
	
SOLUTION:
	Runtime: 2 ms, faster than 55.84% of Java online submissions for Decode Ways.
	Memory Usage: 36 MB, less than 74.53% of Java online submissions for Decode Ways.
 */

public class DecodeWays {
	public int numDecoding(String s) {
		
		//null case
		if (s.length() == 0) {
			return 0;
		}
		
		// create an array to store the total number of ways that the string can be
		// decoded as, starting at the first index with value 1
		int[] cache = new int[s.length()];
		cache[0] = 1;
		
		// if the first index is 0, next one is 0, else it's 1
		if (s.charAt(0) == '0') {
			cache[1] = 0;
		} else {
			cache[1] = 1;
		}
		
		// go through for loop and update the current index's value based on the 1-digit number and  
		// the 2-digit number before it in the given string
		for (int i = 2; i < s.length(); i++) {
			int s1 = Integer.parseInt(s.substring(i - 1, i));
			int s2 = Integer.parseInt(s.substring(i - 2, i));
			if (s1 > 0 && s1 < 10) {
				cache[i] += cache[i - 1];
			}
			if (s2 > 9 && s2 < 27) {
				cache[i] += cache[i - 2];
			}
		}
		
		// return the last value in the array
		return cache[s.length()];
	}

}
