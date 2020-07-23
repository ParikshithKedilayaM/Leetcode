package arrays.medium;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int max = 0;
		int len = height.length;
		int start = 0;
		int end = len - 1;
		while (start < end) {
			if (height[start] < height[end]) {
				max = max >= height[start] * (end - start) ? max : height[start] * (end - start);
				start++;
			} else {
				max = max >= height[end] * (end - start) ? max : height[end] * (end - start);
				end--;
			}
		}
		return max;
	}
}
