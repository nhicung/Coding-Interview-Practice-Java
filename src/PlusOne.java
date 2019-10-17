

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int d = digits.length-1;
        while (d>=0){
            if (digits[d] < 9){
                digits[d] ++;
                return digits;
            }
            digits[d] = 0;
            d--;
        }
        int [] newNumber = new int[digits.length +1];
        newNumber[0] = 1;
        return newNumber;
    }
}
