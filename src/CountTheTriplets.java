import java.util.Arrays;
import java.util.Scanner;

/**
 * Geeks for Geeks
 * 
 * https://practice.geeksforgeeks.org/problems/count-the-triplets/0
 * @author Parikshith Kedilaya Mallar
 *
 */
class GFG1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		while (numberOfTestCases-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int answer = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);

			for (int i = n - 1; i >= 0; i--) {
				int start = 0, end = i - 1;
				while (start < end) {
					if (arr[start] + arr[end] == arr[i]) {
						answer++;
						start++;
						end--;
					} else if (arr[start] + arr[end] < arr[i]) {
						start++;
					} else {
						end--;
					}
				}
			}
			answer = answer == 0 ? -1 : answer;
			System.out.println(answer);
		}
		sc.close();
	}
}