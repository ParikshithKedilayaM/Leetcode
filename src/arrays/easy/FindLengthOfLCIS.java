package arrays.easy;

public class FindLengthOfLCIS {
	public int findLengthOfLCIS(int[] nums) {
		if (nums.length <= 1) {
			return nums.length;
		}
		int max = 0, lmax = 1;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) {

				lmax++;
			} else {
				lmax = 1;
			}
			max = lmax > max ? lmax : max;
		}
		return max;
	}
}
