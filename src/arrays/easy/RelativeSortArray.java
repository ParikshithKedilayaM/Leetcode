package arrays.easy;

import java.util.Arrays;

public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			int count = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					count++;
					arr1[j] = -1;
				}
			}
			for (int k = index; k < index + count; k++) {
				res[k] = arr2[i];
			}
			index = index + count;
		}
		Arrays.sort(arr1);
		for (int i : arr1) {
			if (i != -1) {
				res[index++] = i;
			}
		}
		return res;
	}
}
