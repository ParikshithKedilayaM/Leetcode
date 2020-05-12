package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeroes {
	public void duplicateZeros(int[] arr) {
		List<Integer> lit = new ArrayList<>();
		for (int i : arr) {
			if (i == 0) {
				lit.add(0);
			}
			lit.add(i);
		}
		int i = 0;
		while (i < arr.length) {
			arr[i] = lit.get(i);
			i++;
		}
	}
}
