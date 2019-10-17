package oaneaway;

public class OneAway {
	public static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneReplace(first, second);
		} else if (first.length() == second.length() + 1) {
			return oneInsert(second, first);
		} else if (first.length() == second.length() - 1) {
			return oneInsert(first, second);
		}
		return false;
	}

	public static boolean oneReplace(String r1, String r2) {
		boolean foundDifference = false;
		for (int i = 1; i < r1.length(); i++) {
			if (r1.charAt(i) != r2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}

	public static boolean oneInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
}
