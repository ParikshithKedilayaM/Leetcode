package arrays.easy;

public class ValidMountainArray {
	public boolean validMountainArray(int[] A) {
		int peak = -1, peakIndex = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > peak) {
				peak = A[i];
				peakIndex = i;
			}
		}
		for (int i = 0; i < peakIndex; i++) {
			if (A[i] >= A[i + 1]) {
				return false;
			}
		}
		if (peakIndex == 0)
			return false;
		if (peakIndex == A.length - 1)
			return false;
		for (int i = peakIndex + 1; i < A.length; i++) {
			if (A[i] >= A[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
