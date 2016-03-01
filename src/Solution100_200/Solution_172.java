package Solution100_200;

public class Solution_172 {
	public static void main (String[] args) {
		Solution_172 test = new Solution_172();
		int[] A = {0,4,4,0,4,4,4,0,2};
		int elem = 4;
		int len = test.removeElement(A, elem);
		for (int i = 0; i < len; i ++) {
			System.out.print (A[i] + " ");
		}
	}
	public int removeElement(int[] A, int elem) {
        int i = 0 ;
        int j = A.length - 1;
        int temp = A[i];
        while (i < j) {
System.out.println (i + "   " + j);
        		while (i < j && A[j] == elem) {
        			j --;
        		}
        		A[i] = A[j];
        		while (i < j && A[i] != elem) {
        			i ++;
        		}
        		A[j] = A[i];
        }
        System.out.println (i + "   " + j);
        A[i] = temp;
        if (temp == elem) {
        		return i;
        } else {
        		return i + 1;
        }
    }
}
