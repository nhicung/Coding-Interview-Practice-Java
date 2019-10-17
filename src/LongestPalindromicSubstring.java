/*
DESCRIPTION:
	Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
	
	Example 1:
	
	Input: "babad"
	Output: "bab"
	Note: "aba" is also a valid answer.
	Example 2:
	
	Input: "cbbd"
	Output: "bb"
SOLUTION:
	Runtime: 6 ms, faster than 86.96% of Java online submissions for Longest Palindromic Substring.
	Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Longest Palindromic Substring.

 */


public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		if (s.length() < 1 || s == null) {
			return "";
		}
		int start = 0;
		int longestVal =0;
		for (int i = 0; i < s.length(); i++) {
			int case1 = validString(s,i,i);
			int case2 = validString(s,i, i+1);
			if (longestVal < Math.max(case1, case2)){
                if (case1 > case2) {
				    start = i - case1/2;
                } else {
                    start = i -case2/2 + 1;
                }
                longestVal = Math.max(case1,case2);
            }
		}
		return s.substring(start, start+longestVal);
			
	}
	
	public int validString(String s, int left, int right) {
		for (; left>= 0 && right<s.length(); left++, right--) {
			if (s.charAt(left) != s.charAt(right)) {
				break;
			}
		}
		return right - left -1;
	}
}
