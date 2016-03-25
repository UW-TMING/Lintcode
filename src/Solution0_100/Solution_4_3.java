package Solution0_100;

import java.util.ArrayList;
import java.util.List;

public class Solution_4_3 {
	public int nthUglyNumber(int n) {
		List<Integer> res = new ArrayList<Integer> ();
		int p2 = 0;
		int p3 = 0;
		int p5 = 0;
		res.add(1);
		int count = 1;
		int cur = 2;
		while (count++ < n) {
			while (res.get(p2) * 2 < cur) {
				p2 ++;
			}
			int min2 = res.get(p2) * 2;
			while (res.get(p3) * 2 < cur) {
				p3 ++;
			}
			int min3 = res.get(p3) * 3;
			while (res.get(p5) * 2 < cur) {
				p5 ++;
			}
			int min5 = res.get(p5) * 5;
			int next = min2 < min3 ? min2 : min3;
			next = next < min5 ? next : min5;
			cur = next + 1;
			res.add(next);
		}
		return res.get(n - 1);
	}
}
