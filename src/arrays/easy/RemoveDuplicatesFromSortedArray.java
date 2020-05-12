package arrays.easy;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[count]) {
				count++;
				nums[count] = nums[i];
			}
		}
		return count + 1;
	}
}
