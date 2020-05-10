package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
	public List<Integer> luckyNumbers(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length, row, col;
		List<Integer> rowMin = new ArrayList<>();
		List<Integer> colMax = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			row = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] < row) {
					row = matrix[i][j];
				}
			}
			rowMin.add(row);
		}
		for (int i = 0; i < n; i++) {
			col = Integer.MIN_VALUE;

			for (int j = 0; j < m; j++) {
				if (matrix[j][i] > col) {
					col = matrix[j][i];
				}
			}
			colMax.add(col);
		}
		List<Integer> ans = new ArrayList<>();
		for (int r : rowMin) {
			if (colMax.contains(r)) {
				ans.add(r);
			}
		}

		return ans;
	}
}
