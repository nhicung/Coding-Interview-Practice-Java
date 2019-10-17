/*
 PROBLEM DESCRIPTION:
 	Given an array of strings, group anagrams together.

	Example:
	
	Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
	Output:
	[
	  ["ate","eat","tea"],
	  ["nat","tan"],
	  ["bat"]
	]
	
	Note:	
	All inputs will be in lowercase.
	The order of your output does not matter.

 
 MY SOLUTION:
	 Runtime: 9 ms, faster than 47.87% of Java online submissions for Group Anagrams.
	 Memory Usage: 41.7 MB, less than 36.26% of Java online submissions for Group Anagrams.

 */



import java.util.*;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<List<String>>();
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if (!map.containsKey(sorted)) {
				List<String> list = new ArrayList<String>();
				map.put(sorted, list);
			}
			map.get(sorted).add(s);
		}
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			res.add(entry.getValue());
		}
		return res;
	}
}
