package arrays.easy;

public class CountNegativeNumbersInSortedMatrix {
	public int countNegatives(int[][] grid) {
        int count = 0, m = grid[0].length - 1, n=grid.length-1;
         for (int i=n; i>=0; i--) {
             for (int j=m; j>=0; j--) {
                 if (grid[i][j] < 0)  {
                     count++;
                 } else{
                     break;
                 }
             }
         }
        return count;
    }
}
