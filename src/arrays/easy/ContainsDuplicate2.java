package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n = 0; n < nums.length; n++) {
			if (map.containsKey(nums[n])) {
				if ((n - map.get(nums[n])) <= k)
					return true;
			}
			map.put(nums[n], n);
		}
		return false;
	}
}
