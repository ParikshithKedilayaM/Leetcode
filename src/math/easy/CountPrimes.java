package math.easy;

public class CountPrimes {
	public int countPrimes(int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	private boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
