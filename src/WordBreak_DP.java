import java.util.*;

/*
DESCRIPTION:
	Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
	
	Note:
	
	The same word in the dictionary may be reused multiple times in the segmentation.
	You may assume the dictionary does not contain duplicate words.
	Example 1:
	
	Input: s = "leetcode", wordDict = ["leet", "code"]
	Output: true
	Explanation: Return true because "leetcode" can be segmented as "leet code".
	Example 2:
	
	Input: s = "applepenapple", wordDict = ["apple", "pen"]
	Output: true
	Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
	             Note that you are allowed to reuse a dictionary word.
	Example 3:
	
	Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
	Output: false
	
	SOLUTION:
	Runtime: 4 ms, faster than 78.64% of Java online submissions for Word Break.
	Memory Usage: 36 MB, less than 93.48% of Java online submissions for Word Break.	
 */

public class WordBreak_DP {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] cache = new boolean[s.length()+1];
		cache[0] = true;
		for ( int i = 1; i < cache.length; i++) {
			for (int j = 0; j < i; j++) {
				if (cache[j] && wordDict.contains(s.substring(j,i))) {
					cache[i] = true;
					break;
				}
			}
		}
		return cache[s.length()];
	}
}
