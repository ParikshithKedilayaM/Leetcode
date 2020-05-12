package arrays.easy;

public class SumOfEvenNumbersAfterQueries {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] result = new int[queries.length];
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0)
				sum += A[i];
		}
		for (int i = 0; i < queries.length; i++) {

			if (A[queries[i][1]] % 2 == 0) {
				sum -= A[queries[i][1]];
			}
			A[queries[i][1]] += queries[i][0];
			if (A[queries[i][1]] % 2 == 0) {
				sum += A[queries[i][1]];
			}
			result[i] = sum;
		}
		return result;
	}
}
