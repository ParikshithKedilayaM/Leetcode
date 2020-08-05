package math.easy;

public class SqrtUsingBinarySearch {
	public int mySqrt(int x) {
		if (x < 1)
			return 0;
		if (x < 4)
			return 1;
		int low = 0, high = x, mid, k;
		while (high - low > 1) {
			mid = (low + high) / 2;
			k = x / mid;
			if (mid > k) {
				high = mid;
			} else if (mid < k) {
				low = mid;
			} else {
				return mid;
			}
		}
		return low;
	}
}
