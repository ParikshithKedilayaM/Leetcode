import java.util.Scanner;

/**
 * 
 * Geeks for Geeks
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 * 
 * @author Parikshith Kedilaya Mallar
 *
 */
class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			int n = sc.nextInt();
			int total = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			int i1 = 0, i2 = 0, lmax = 0;
			while (lmax != total && i1 < n && i2 < n) {
				if (lmax < total) {
					lmax += arr[i1++];
				}
				while (lmax > total) {
					lmax -= arr[i2++];
				}
			}
			if (lmax != total)
				System.out.println("-1");
			else
				System.out.println((i2 + 1) + " " + i1);
		}
		sc.close();
	}
}