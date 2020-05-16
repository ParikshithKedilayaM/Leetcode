package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		if (numRows == 0)
			return new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> currentRow = new ArrayList<>();
		currentRow.add(1);
		result.add(currentRow);
		for (int i = 1; i < numRows; i++) {
			List<Integer> prevRow = new ArrayList<>(currentRow);
			currentRow = new ArrayList<Integer>();
			for (int j = 0; j < prevRow.size() + 1; j++) {
				if (j == 0)
					currentRow.add(prevRow.get(j));
				else if (j == prevRow.size())
					currentRow.add(prevRow.get(j - 1));
				else
					currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			result.add(currentRow);
		}
		return result;
	}
}
