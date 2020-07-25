import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG2 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			int numberOfTestCases = Integer.parseInt(br.readLine());
			while (numberOfTestCases-- > 0) {
				int n = Integer.parseInt(br.readLine());
				int[] arr = new int[n];
				String inputString = br.readLine();
				int index = 0;
				for (String str : inputString.split("[ ]")) {
					arr[index++] = Integer.parseInt(str);
				}
				int maxSoFar = arr[0], maxEndingHere = arr[0];

				for (int i = 1; i < n; i++) {
					maxEndingHere = Math.max(arr[i], arr[i] + maxEndingHere);
					maxSoFar = Math.max(maxSoFar, maxEndingHere);
				}
				System.out.println(maxSoFar);
			}
		} catch (Exception e) {
		}
	}
}