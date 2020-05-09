package arrays.easy;

public class NumbersSmallerThanCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int tempCounter;
        int[] resultArray = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            tempCounter = 0;
            for (int j=0; j<nums.length; j++) {
                if (i!=j && nums[i]>nums[j]) {
                    tempCounter++;
                }
            }
            resultArray[i] = tempCounter;
        }
        return resultArray;
    }
}
