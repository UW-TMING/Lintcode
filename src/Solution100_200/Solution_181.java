package Solution100_200;

public class Solution_181 {
	public static int bitSwapRequired(int a, int b) {
        if (a == b) return 0;
        int c = a ^ b;
        int count = 0;
        while (c != 0) {
        		count += c & 1;
        		c = c >>> 1;
        }
        return count;
    }
}
