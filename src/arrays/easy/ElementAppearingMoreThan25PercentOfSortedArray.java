package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25PercentOfSortedArray {
	public int findSpecialInteger(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			if (map.get(i) > arr.length / 4) {
				return i;
			}
		}

		return -1;
	}
}
