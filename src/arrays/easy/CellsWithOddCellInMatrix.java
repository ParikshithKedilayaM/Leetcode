package arrays.easy;

public class CellsWithOddCellInMatrix {
	public int oddCells(int n, int m, int[][] indices) {
        int result = 0, row = 0, col = 0;
        int[][] finalMatrix = new int[n][m];
        for (int i=0; i<indices.length; i++) {
            row = indices[i][0];
            col = indices[i][1];
            for (int j=0; j<m ; j++) {
                finalMatrix[row][j] += 1;
            }
            for (int j=0; j<n; j++) {
                finalMatrix[j][col] += 1;
            }
            
        }
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (finalMatrix[i][j] % 2 != 0) {
                    result ++;
                }
            }
        }
        return result;
    }
}
