package arrays.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shift2DGrid {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
		LinkedList<Integer> tempList = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				tempList.add(grid[i][j]);
			}
		}
		int popped;
		while (k > 0) {
			popped = tempList.removeLast();
			tempList.add(0, popped);
			k--;
		}
		for (int i = 0; i < grid.length; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < grid[0].length; j++) {
				row.add(tempList.remove());
			}
			result.add(row);
		}
		return result;
	}
}
