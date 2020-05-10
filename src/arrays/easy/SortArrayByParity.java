package arrays.easy;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        int[] op = new int[A.length];
        int i=0, j=A.length-1;
        for (int elm : A) {
            if (elm%2==0) {
                op[i++] = elm;
            } else {
                op[j--] = elm;
            }
        }
        return op;
    }
}
