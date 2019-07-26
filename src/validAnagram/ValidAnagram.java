package validAnagram;

import java.util.Arrays;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		/*
		 * Map<Character,Integer> map = new HashMap<Character,Integer>();
		 * 
		 * for (int i =0; i < s.length(); i++){ char c1 = s.charAt(i); if
		 * (!map.containsKey(c1)){ map.put(c1,0); } map.put(c1, map.get(c1) +1); }
		 * 
		 * for (int j =0; j < t.length(); j++){ char c2 = t.charAt(j); if
		 * (!map.containsKey(c2)){ map.put(c2,0); } map.put(c2, map.get(c2) -1); }
		 * 
		 * for (Map.Entry<Character, Integer> entry : map.entrySet()){ if
		 * (entry.getValue()!=0){ return false; } }
		 * 
		 * return true;
		 * 
		 */

		if (s.length() != t.length()) {
			return false;
		}
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		return Arrays.equals(str1, str2);
	}
}
