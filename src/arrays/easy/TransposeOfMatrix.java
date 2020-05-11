package arrays.easy;

public class TransposeOfMatrix {
	public int[][] transpose(int[][] A) {
		int[][] newArr = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				newArr[j][i] = A[i][j];
			}
		}

		return newArr;
	}
}
