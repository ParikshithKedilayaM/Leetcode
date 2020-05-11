package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] <= minDiff) {
				List<Integer> pair = new ArrayList<>();
				if (arr[i + 1] - arr[i] < minDiff)
					list = new ArrayList<>();
				pair.add(arr[i]);
				pair.add(arr[i + 1]);
				list.add(pair);
			}
			minDiff = Math.min(arr[i + 1] - arr[i], minDiff);
		}
		return list;
	}
}
