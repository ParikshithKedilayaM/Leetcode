package arrays.easy;

public class ReplaceElementWithGreatestElementRightSide {
	public int[] replaceElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] output = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            if (i == arr.length-1) output[i] = -1;
            else {
                output[i] = max;
            }
            max = Math.max(arr[i], max);
        }
        return output;
    }
}
