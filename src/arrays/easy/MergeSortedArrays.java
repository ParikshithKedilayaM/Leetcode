package arrays.easy;

public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] res = nums1.clone();
		int i = 0, j = 0, count = 0;
		while (i < m && j < n) {

			if (res[i] <= nums2[j]) {
				nums1[count++] = res[i++];
			} else {
				nums1[count++] = nums2[j++];
			}
		}
		while (i < m) {
			nums1[count++] = res[i++];
		}
		while (j < n) {
			nums1[count++] = nums2[j++];
		}
	}
}
