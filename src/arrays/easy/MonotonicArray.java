package arrays.easy;

public class MonotonicArray {
	public boolean isMonotonic(int[] A) {
		if (A.length <= 2) {
			return true;
		}
		int order = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (order == 0 && A[i] == A[i + 1])
				continue;
			else if (order == 0)
				order = (A[i] - A[i + 1]) < 0 ? 1 : 2;
			if (order == 1 && A[i + 1] < A[i]) {
				return false;
			} else if (order == 2 && A[i + 1] > A[i]) {
				return false;
			}
		}
		return true;
	}
}
