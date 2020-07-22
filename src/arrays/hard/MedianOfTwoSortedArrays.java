package arrays.hard;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int mn = m + n;
		double nums3[] = new double[mn];
		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				nums3[k++] = nums1[i++];
			} else {
				nums3[k++] = nums2[j++];
			}
		}
		while (i < m) {
			nums3[k++] = nums1[i++];
		}
		while (j < n) {
			nums3[k++] = nums2[j++];
		}
		if (mn % 2 == 0) {
			return (nums3[mn / 2] + nums3[(mn / 2) - 1]) / 2;
		} else {
			return nums3[mn / 2];
		}
	}
}
