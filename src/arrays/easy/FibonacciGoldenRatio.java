package arrays.easy;

public class FibonacciGoldenRatio {
	public int fib(int N) {
		double goldenRatio = (1 + Math.sqrt(5)) / 2;
		return (int) Math.round(Math.pow(goldenRatio, N) / Math.sqrt(5));
	}
}
