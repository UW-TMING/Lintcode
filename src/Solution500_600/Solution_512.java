package Solution500_600;

public class Solution_512 {
	public static void main (String[] args) {
		
	}
	public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] helper = new int[s.length()];
        int a1 = s.charAt(0) - '0';
        if (valid(a1)) helper[0] = 1;
        if (s.length() <= 1) return helper[0]; 
        int a2 = s.charAt(1) - '0';
        if (valid(a2)) helper[1] = 1;
        int temp = a1 * 10 + a2;
        if (valid(temp)) helper[1]++;
        for (int i = 2; i < s.length(); i ++) {
        		int ai = s.charAt(i) - '0';
        		int ai1 = s.charAt(i - 1) - '0';
        		if (valid(ai)) helper[i] += helper[i - 1];
        		int sumI = ai1 * 10 + ai;
        		if (valid(sumI)) helper[i] += helper[i - 2];
        }
        return helper[s.length() - 1];
    }
	public boolean valid(int k) {
		if (k > 0 && k < 27) {
			return true;
		}
		return false;
	}
}
