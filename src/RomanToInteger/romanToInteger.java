package romanToInteger;

public class romanToInteger {
	public int romanToInt(String s) {
		int result = 0;
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);

			if (s.length() - i > 1) {
				String sNew = s.substring(i, i + 2);

				if (sNew.equals("IV")) {
					result += 4;
					i += 2;
					continue;
				}
				if (sNew.equals("IX")) {
					result += 9;
					i += 2;
					continue;
				}
				if (sNew.equals("XL")) {
					result += 40;
					i += 2;
					continue;
				}
				if (sNew.equals("XC")) {
					result += 90;
					i += 2;
					continue;
				}
				if (sNew.equals("CD")) {
					result += 400;
					i += 2;
					continue;
				}
				if (sNew.equals("CM")) {
					result += 900;
					i += 2;
					continue;
				}
			}

			if (c == 'I') {
				result += 1;
			}
			if (c == 'V') {
				result += 5;
			}
			if (c == 'X') {
				result += 10;
			}
			if (c == 'L') {
				result += 50;
			}
			if (c == 'C') {
				result += 100;
			}
			if (c == 'D') {
				result += 500;
			}
			if (c == 'M') {
				result += 1000;
			}
			i++;
		}
		return result;
	}
}
