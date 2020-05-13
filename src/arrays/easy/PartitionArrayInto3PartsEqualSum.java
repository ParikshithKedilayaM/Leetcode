package arrays.easy;

public class PartitionArrayInto3PartsEqualSum {
	public boolean canThreePartsEqualSum(int[] A) {
		int sum = 0;
		for (int i : A) {
			sum += i;
		}
		if (sum % 3 != 0)
			return false;
		int sumbythree = sum / 3;
		int count = 0, j = 0, counter = 0;
		while (j < A.length) {

			count += A[j];
			if (count == sumbythree) {
				count = 0;
				counter++;
			}
			j++;
		}
		if (j == A.length && count == 0 && counter >= 3)
			return true;
		else
			return false;
	}
}
