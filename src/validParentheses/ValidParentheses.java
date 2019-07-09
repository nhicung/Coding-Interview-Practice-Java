package validParentheses;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.isEmpty()) {
			return true;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i + 1);
			if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')) {
				String sNew = s.substring(0, i) + s.substring(i + 2, s.length());
				return isValid(sNew);
			}
		}
		return false;
	}

}
