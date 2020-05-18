package arrays.easy;

public class MaximumProductOfThreeNumbers {
	public int maximumProduct(int[] nums) {
		int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max1;
		int min1 = Integer.MAX_VALUE, min2 = min1;
		for (int n : nums) {
			if (n <= min1) {
				min2 = min1;
				min1 = n;
			} else if (n <= min2) {
				min2 = n;
			}
			if (n >= max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (n >= max2) {
				max3 = max2;
				max2 = n;
			} else if (n >= max3) {
				max3 = n;
			}
		}
		return Math.max(max1 * max2 * max3, min1 * min2 * max1);
	}
}
