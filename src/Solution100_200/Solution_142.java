package Solution100_200;

public class Solution_142 {
	public boolean checkPowerOf2(int n) {
		if (n < 0) return false;
        while (n != 0) {
        		int k = n & 1;
        		n = n >>> 1;
        		if (k == 1 && n != 0) return false;
        		if (k == 1 && n == 0) return true;
        }
        return false;
    }
	public boolean checkPowerOf21(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
