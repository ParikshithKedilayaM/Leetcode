package arrays.medium;

/**
 * @implNote Integers in each row are sorted from left to right. The first
 *           integer of each row is greater than the last integer of the
 *           previous row.
 * 
 * @author Parikshith Kedilaya Mallar
 *
 */
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}
		int i = 0, j = matrix[0].length - 1;
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] > target) {
				j--;
			} else if (matrix[i][j] < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}
}
