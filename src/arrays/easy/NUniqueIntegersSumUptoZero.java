package arrays.easy;

public class NUniqueIntegersSumUptoZero {
	public int[] sumZero(int n) {
        int[] output = new int[n];
        if (n % 2 == 0) {
            int max = n / 2;
            while (n!=0) {
                if (max!= 0) {
                    output[n-1] = max;
                    n--;
                }
                max--;
            }
        } else {
            int max = n / 2;
            while (n!=0) {
                output[n-1] = max;
                n--;max--;
            }
        }
        return output;
    }
}
