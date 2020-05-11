package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerArray {
	public int findLucky(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int max = -1;
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);

		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getKey() == m.getValue()) {
				max = Math.max(max, m.getKey());
			}
		}

		return max;
	}
}
