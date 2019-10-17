

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		return helper(n, new HashSet<Integer>());
	}

	boolean helper(int n, Set<Integer> set) {
		if (n == 1) {
			return true;
		} else if (set.contains(n)) {
			return false;
		}

		set.add(n);
		int result = 0;
		String s = Integer.toString(n);
		int[] newList = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			newList[i] = s.charAt(i) - '0';
			result += Math.pow(newList[i], 2);
			// System.out.println(result);

		}

		return helper(result, set);
	}
}
