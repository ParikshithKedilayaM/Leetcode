import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/
 * 
 * O(n) time-complexity, O(1) space complexity
 * 
 * @author Parikshith Kedilaya Mallar
 *
 */

class GFG6 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int noOfTC = Integer.parseInt(br.readLine());
			while (noOfTC-- > 0) {
				int n = Integer.parseInt(br.readLine());
				String line = br.readLine();
				int in = 0;
				long arr[] = new long[n];
				for (String s : line.trim().split("[ ]")) {
					arr[in++] = Integer.parseInt(s);
				}
				int first = 0, last = arr.length - 1;
				long maxElm = arr[last] + 1;
				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						arr[i] += (arr[last] % maxElm) * maxElm;
						last--;
					} else {
						arr[i] += (arr[first] % maxElm) * maxElm;
						first++;
					}
				}

				for (int i = 0; i < n; i++) {
					arr[i] /= maxElm;
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
		}
	}
}