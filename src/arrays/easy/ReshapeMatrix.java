package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (r * c != nums.length * nums[0].length) {
			return nums;
		}
		List<Integer> list = new ArrayList<>();
		int[][] result = new int[r][c];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				list.add(nums[i][j]);
			}
		}
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = list.get(count++);
			}
		}

		return result;
	}
}
