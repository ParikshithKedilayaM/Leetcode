package arrays.easy;

public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] A) {
        int[] op = new int[A.length];
        int i=0, j=A.length-1;
        for (int elm : A) {
            if (elm%2==0) {
                op[i] = elm;
                i=i+2;
            } else {
                op[j] = elm;
                j=j-2;
            }
        }
        return op;
    }
}
