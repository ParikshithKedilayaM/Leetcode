package arrays.medium;

public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
		int start = 1;
		int[][] matrix = new int[n][n];
		int i = 0, j = 0, max = n;

		while (start <= n * n) {
			while (j < max) {
				matrix[i][j++] = start++;
			}
			j--;
			i++;
			while (i < max) {
				matrix[i++][j] = start++;
			}
			i--;
			j--;
			while (j >= n - max) {
				matrix[i][j--] = start++;
			}
			j++;
			i--;
			max--;
			while (i >= n - max) {
				matrix[i--][j] = start++;
			}
			i++;
			j++;
		}

		return matrix;
	}
}
