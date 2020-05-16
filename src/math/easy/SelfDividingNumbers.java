package math.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (check(i)) {
				result.add(i);
			}
		}
		return result;
	}

	private boolean check(int num) {
		int originalNum = num;
		while (num > 0) {
			int num1 = num % 10;
			num = num / 10;
			if (num1 == 0)
				return false;
			if (originalNum % num1 != 0)
				return false;
		}
		return true;
	}
}
