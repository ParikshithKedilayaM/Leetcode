import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG3 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int noOfTC = Integer.parseInt(br.readLine());
			while (noOfTC-- > 0) {
				int n = Integer.parseInt(br.readLine());
				;
				int expected = n;
				for (int i = 1; i < n; i++) {
					expected += (n - i);
				}
				int given = 0;
				String line = br.readLine().trim();
				for (String j : line.split("[ ]")) {
					given += Integer.parseInt(j);
				}
				System.out.println(expected - given);
			}
		} catch (Exception e) {
		}
	}
}