package arrays.easy;

public class MaximumAverageSubArray {
	public double findMaxAverage(int[] nums, int k) {
		int sum = 0, lsum = 0, i = 0;
		if (nums.length < k)
			k = nums.length;
		for (int n = 0; n < k; n++) {
			sum += nums[n];
		}
		lsum = sum;
		for (int n = k; n < nums.length; n++) {
			lsum -= nums[i++];
			lsum += nums[n];
			sum = Math.max(sum, lsum);
		}
		return sum * 1.0 / k;
	}
}
