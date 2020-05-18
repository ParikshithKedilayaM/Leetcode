package arrays.easy;

public class LargestNumberAtLeastTwiceOfOthers {
	public int dominantIndex(int[] nums) {
		int max = -1, second = -1, indexMax = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				second = max;
				max = nums[i];
				indexMax = i;
			} else if (nums[i] > second) {
				second = nums[i];
			}
		}
		if (max >= 2 * second) {
			return indexMax;
		}
		return -1;
	}
}
