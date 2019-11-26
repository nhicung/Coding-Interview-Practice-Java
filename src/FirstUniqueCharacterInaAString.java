import java.util.HashMap;
import java.util.Map;

/*
DESCRIPTION:
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

SOLUTION:
Runtime: 44 ms, faster than 29.79% of Java online submissions for First Unique Character in a String.
Memory Usage: 38.4 MB, less than 96.43% of Java online submissions for First Unique Character in a String.
 */
public class FirstUniqueCharacterInaAString {
	public int firstUniqChar(String s) {
		// map each character of the string to the number it appear in the string
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        //go through for loop, if map doesn't have the character, initialize its value with 0. 
        // then keep updating the value
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,0);
            }
            map.put(c,map.get(c)+1);
        }
        for ( int i = 0; i < s.length(); i ++) {
            if (map.get(s.charAt(i)) == 1){
                return i; 
            }
        }
        return -1;
    }
}
