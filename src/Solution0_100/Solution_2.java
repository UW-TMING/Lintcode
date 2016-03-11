package Solution0_100;

public class Solution_2 {
	public long trailingZeros(long n) {
        if ( n < 5) {
    		return 0;
    	}
    	long count = 0;
    	for (long i = 5; n / i != 0; i *= 5) {
    		count += n / i;
    	}
    	return count;
    }
}
