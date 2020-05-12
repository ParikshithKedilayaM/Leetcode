package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			if (map.getOrDefault(n, 0) != 0) {
				return true;
			}
			map.put(n, 1);
		}
		return false;
	}
}
