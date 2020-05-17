package arrays.easy;

public class ThirdMax {
	public int thirdMax(int[] nums) {
		Integer max1 = null, max2 = null, max3 = null;
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		for (int n : nums) {
			if ((max1 != null && n == max1) || (max2 != null && n == max2) || (max3 != null && n == max3))
				continue;
			if (max1 == null || max1 < n) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (max2 == null || max2 < n) {
				max3 = max2;
				max2 = n;
			} else if (max3 == null || max3 < n) {
				max3 = n;
			}
		}
		return max3 == null ? max1 : max3;
	}
}
