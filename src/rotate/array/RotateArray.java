package rotate.array;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		if (k == 0) {
			return;
		} else {
			int last = nums[nums.length - 1];
			for (int i = nums.length - 1; i > 0; i--) {
				nums[i] = nums[i - 1];
			}
			nums[0] = last;
			k = k -= 1;
			rotate(nums, k);
		}
	}
}
