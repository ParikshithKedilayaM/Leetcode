package arrays.easy;

public class MissingNumberGaussFormula {
	public int missingNumber(int[] nums) {
		int Tsum = nums.length * (nums.length + 1) / 2;
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		return Tsum - sum;
	}
}
