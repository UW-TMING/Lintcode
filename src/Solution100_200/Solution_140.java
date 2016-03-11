package Solution100_200;

public class Solution_140 {
	public static void main (String[] args) {
		Solution_140 test = new Solution_140();
		int a  = 109; 
		int b = 10000007;
		int n = 1000001;
		System.out.println(test.fastPower(a, b, n));
	}
	public int fastPower(int a, int b, int n) {
        if (n == 0) return Integer.MAX_VALUE;
        return pow(a, b, n) ;
    }
	public int pow (int a, int b, int n) {
		if (n == 0) return 1;
		if (n == 1) return a % b;
		int k = n % 2;
		int div = n / 2;
		long temp1 = pow (a, b, div);
		int temp2 = 1;
		if (k == 1) temp2 = a;
		long temp3 = temp1 * temp2;
		return (int)(((temp1 % b) * (temp3 % b)) % b) ;
	}
}
