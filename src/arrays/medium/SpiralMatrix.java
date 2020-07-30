package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return res;
		}
		int n = matrix.length, m = matrix[0].length, count = 1;
		int i = 0, j = 0, nos = m * n;
		while (count <= nos) {
			while (j < m) {
				res.add(matrix[i][j]);
				j++;
				count++;
			}
			j--;
			i++;
			while (i < n) {
				res.add(matrix[i][j]);
				i++;
				count++;
			}
			i--;
			j--;
			while (j >= matrix[0].length - m) {
				res.add(matrix[i][j]);
				j--;
				count++;
			}
			j++;
			i--;
			n--;
			while (i >= matrix.length - n) {
				res.add(matrix[i][j]);
				i--;
				count++;
			}
			i++;
			j++;
			m--;
		}
		while (res.size() > nos) {
			res.remove(res.size() - 1);
		}
		return res;
	}
}
