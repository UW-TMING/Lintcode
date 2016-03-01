package solution400_500;

public class Solution_428 {
	public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        boolean positive = true;
        if (n < 0) {
        		positive = false;
        }
        int temp = n / 2;
        int l = n - temp * 2;
        double v1 = myPow (x, temp);
        double v2 = myPow (x, l);
        if (positive) {
        		return v1 * v1 * v2;
        } else {
        		return 1 / v1 * v1 * v2;
        }
    }
}
