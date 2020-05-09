package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class TargetArrayInGivenOrder {
	public int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i=0; i<nums.length; i++) {
            targetArray[i] = list.get(i);
        }
        return targetArray;
    }
}
