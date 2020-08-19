package arrays.medium;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int target = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= target) {
				target = i;
			}
		}
		return target == 0;
	}
}
