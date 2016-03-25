package Solution500_600;

import java.util.ArrayList;
import java.util.List;

public class Solution_518 {
	public int nthSuperUglyNumber(int n, int[] primes) {
        if (primes == null || primes.length == 0 || n <= 1) return 1;
        List<Long> res = new ArrayList<Long> ();
        int len = primes.length;
        int[] p = new int[len];
        int count = 1;
        long cur = primes[0] + 1;
        res.add((long)1);
        while (count++ < n) {
        		long min = Long.MAX_VALUE;
        		for (int i = 0; i < len; i ++) {
        			while(res.get(p[i]) * primes[i] < cur) {
        				p[i] ++;
        			}
        			if (res.get(p[i]) * primes[i] < min) {
        				min = res.get(p[i]) * primes[i];
        			}
        		}
        		cur = min + 1;
        		res.add(min);
        }
        return (int)(long)res.get(n - 1);
    }
}
