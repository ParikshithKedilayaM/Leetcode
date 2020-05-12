package arrays.easy;

public class RotateArray1 {
	public void rotate(int[] nums, int k) {
		while (k > 0) {
			int i = nums.length - 2;
			int last = nums[i + 1];
			while (i >= 0) {
				nums[i + 1] = nums[i];
				i--;
			}
			nums[0] = last;
			k--;
		}

	}
}
