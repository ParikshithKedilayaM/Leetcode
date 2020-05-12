package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
	class Solution {
		public int[] arrayRankTransform(int[] arr) {
			if (arr.length == 0) {
				return new int[0];
			}
			if (arr.length == 1) {
				int[] rank = new int[arr.length];
				rank[0] = 1;
				return rank;
			}
			int[] rank = new int[arr.length];
			Map<Integer, Integer> map = new HashMap<>();
			int[] sortedArr = arr.clone();
			Arrays.sort(sortedArr);
			int rankCounter = 1;
			for (int i = 0; i < sortedArr.length - 1; i++) {
				if (sortedArr[i] == sortedArr[i + 1]) {
					map.put(sortedArr[i], rankCounter);
				} else {
					map.put(sortedArr[i], rankCounter++);
				}
			}
			if (sortedArr[sortedArr.length - 2] != sortedArr[sortedArr.length - 1])
				map.put(sortedArr[sortedArr.length - 1], rankCounter++);
			else
				map.put(sortedArr[sortedArr.length - 1], rankCounter);
			int count = 0;
			for (int i : arr) {
				rank[count++] = map.get(i);
			}
			return rank;
		}
	}
}
