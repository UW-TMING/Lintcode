package Solution100_200;

public class Solution_182 {
	public static void main (String[] args) {
		String A = "178542";
		int k = 4;
		Solution_182 test = new Solution_182 ();
		System.out.println (test.DeleteDigits(A, k));
	}
	public String DeleteDigits(String A, int k) {
        if (A == null || A.length() == 0 || A.length() < k) return A;
        if (A.length() == k) return "";
        String str = A;
        for (int i = 0; i <= k; i ++) {
        		int j = 0;
        		A = str;
        		str = "";
        		boolean flag = false;
        		while (j < A.length() - 1) {
        			if (A.charAt(j) > A.charAt(j + 1) && !flag) {
        				flag = true;
        				j ++;
        				continue;
        			}
        			str += A.charAt(j ++);
        		}
        		if (flag) str += A.charAt(j);
        }
        int i = 0;
        while (i < A.length()) {
        		if (A.charAt(i) == '0') {
        			i ++;
        		} else {
        			break;
        		}
        }
        return A.substring(i);
    }
}
