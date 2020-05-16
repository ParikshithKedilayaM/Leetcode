package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class BinarPrefixDivisibleBy5 {
	public List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> result = new ArrayList<Boolean>();
		int decimal = 0;
		for (int n : A) {
			decimal = (decimal * 2 + n) % 5;
			if (decimal == 0)
				result.add(true);
			else
				result.add(false);
		}
		return result;
	}
}
