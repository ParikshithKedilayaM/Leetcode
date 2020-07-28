import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/
 * 
 * O(nlogn) time-complexity O(n) space-complexity
 * 
 * @author Parikshith Kedilaya Mallar
 *
 */

class GFG5 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int noOfTC = Integer.parseInt(br.readLine());
			while (noOfTC-- > 0) {

				int n = Integer.parseInt(br.readLine());
				int finalArr[] = new int[n];
				String line = br.readLine();
				int i = 0, arr[] = new int[n];
				for (String s : line.trim().split("[ ]")) {
					arr[i++] = Integer.parseInt(s);
				}
				Arrays.sort(arr);
				int start = 0, end = n - 1, k = 0;
				while (start <= end) {
					if (k % 2 == 0) {
						finalArr[k++] = arr[end--];
					} else {
						finalArr[k++] = arr[start++];
					}
				}
				for (int y : finalArr) {
					System.out.print(y + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
		}
	}
}