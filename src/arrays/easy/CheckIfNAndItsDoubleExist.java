package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class CheckIfNAndItsDoubleExist {
	public boolean checkIfExist(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int n : arr) {
			if (list.contains(n * 2) || (list.contains(n / 2) && n % 2 == 0)) {
				return true;
			}
			list.add(n);
		}
		return false;
	}
}
