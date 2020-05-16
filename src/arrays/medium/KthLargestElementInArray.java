package arrays.medium;

import java.util.Arrays;

public class KthLargestElementInArray {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		int max = Integer.MAX_VALUE;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i <= max) {
				k--;
			}
			if (k == 0) {
				return nums[i];
			}
		}
		return 0;
	}
}
