package arrays.medium;

/**
 * @implNote
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * 
 * @author Parikshith Kedilaya Mallar
 *
 */
public class Search2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}
		int i = 0, j = matrix[0].length - 1;

		while (j >= 0 && i <= matrix.length - 1) {
			if (matrix[i][j] < target) {
				i++;
			} else if (matrix[i][j] > target) {
				j--;
			} else {
				return true;
			}
		}
		return false;
	}
}
