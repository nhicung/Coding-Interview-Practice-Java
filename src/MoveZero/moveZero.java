package moveZero;

public class moveZero {
	public void moveZeroes(int[] nums) {
		/*
		 * int a = nums.length-1; int count = 0; for (int i = 0; i <nums.length; i++){
		 * count++; } int i =0; while(i< nums.length){ if (nums[i] == 0 && count >0){
		 * for ( int j = i; j < nums.length-1; j++){ nums[j] =nums[j+1]; } nums[a]=0;
		 * count--; }else{ i++; } }
		 */

		int i = 0;
		int j = 1;
		while (j < nums.length) {
			if (nums[i] == 0 && nums[j] != 0) {
				int a = nums[i];
				nums[i] = nums[j];
				nums[j] = a;
				i++;
				j++;
			} else if (nums[j] == 0 && nums[i] != 0) {
				i++;
				j++;
			} else if (nums[i] == 0 && nums[j] == 0) {
				j++;
			} else if (nums[i] != 0 && nums[j] != 0) {
				i++;
				j++;
			}
		}
	}
}
