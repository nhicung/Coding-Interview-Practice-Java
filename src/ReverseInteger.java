

public class ReverseInteger {
	public int reverse(int x) {
		int xrev = 0;
		while (x != 0) {
			int n = x % 10;
			x /= 10;
			if (xrev > Integer.MAX_VALUE / 10 || (xrev == Integer.MAX_VALUE / 10 && n > 7)) {
				return 0;
			}
			if (xrev < Integer.MIN_VALUE / 10 || (xrev == Integer.MIN_VALUE / 10 && n < -8)) {
				return 0;
			}
			xrev = xrev * 10 + n;
		}
		return xrev;
	}
}
