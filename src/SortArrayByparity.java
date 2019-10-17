

public class SortArrayByparity {
	public int[] sortArrayByParity(int[] A) {
		int[] anArray = new int[A.length];
		int c = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				anArray[c] = A[i];
				c++;
			}
		}
		for (int j = 0; j < A.length; j++) {
			if (A[j] % 2 == 1) {
				anArray[c] = A[j];
				c++;
			}
		}
		return anArray;
	}
}
