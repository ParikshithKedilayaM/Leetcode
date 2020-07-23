package arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new LinkedList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // corner case {0,0,0,0}
			twoSum(list, nums, i + 1, nums.length - 1, -nums[i]);
		}
		return list;
	}

	private void twoSum(List<List<Integer>> list, int[] nums, int low, int high, int target) {
		if (low > high)
			return;
		HashSet<Integer> set = new HashSet<>();
		for (int i = low; i <= high; i++) {
			if (set.contains(target - nums[i])) {
				list.add(Arrays.asList(-target, nums[i], target - nums[i]));
				while (i + 1 <= high && nums[i] == nums[i + 1])
					i++; // corner case {0,0,0,0}
			} else {
				set.add(nums[i]);
			}
		}
	}
}
