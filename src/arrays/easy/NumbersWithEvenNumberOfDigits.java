package arrays.easy;

public class NumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
        int evenNumbers = 0;
        for (int num : nums) {
            int counter = 1;
            while (num / 10 != 0) {
                counter++;
                num = num / 10;
            }
            if (counter % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
}
