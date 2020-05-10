package arrays.easy;

public class FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i<A.length; i++) {
            A[i] = reverse(A[i]);
        }
        return A;
    }
    private int[] reverse(int[] A) {
        int temp;
        for (int i=0; i<A.length; i++) {
            if (A[i] == 0) {
                A[i] = 1;
            } else {
                A[i] = 0;
            }
        }
        for (int i = 0 ; i < A.length/2; i++) {
            temp = A[i];
            A[i] = A[A.length - i-1];
            A[A.length - i-1] = temp;
        }
        return A;
    }
}
