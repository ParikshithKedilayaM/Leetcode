package arrays.easy;

public class DecompressRunLengthEncodedList {
	public int[] decompressRLElist(int[] nums) {
        int totalLength = 0;
        for (int i=0; i<nums.length; i+=2) {
            totalLength += nums[i];
        }
        int[] outputArray = new int[totalLength];
        int counter = 0;
        for (int i=0; i<nums.length; i+=2) {
            while (nums[i] != 0) {
                nums[i] = nums[i] - 1;
                outputArray[counter++] = nums[i+1];
            }
        }
        return outputArray;
    }
}
