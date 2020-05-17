package arrays.easy;

import java.util.Arrays;

public class HeightChecker {
	public int heightChecker(int[] heights) {
		int counter = 0;
		int[] clonedArray = heights.clone();
		Arrays.sort(heights);
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != clonedArray[i]) {
				counter++;
			}
		}
		return counter;
	}
}
