package Solution300_400;

public class Solution_399_2 {
	public void sortNutsAndBolts(String[] nuts, String[] bolts, NBComparator compare) {
		if (nuts == null || bolts == null || nuts.length != bolts.length) return;
        qsort (nuts, bolts, compare, 0, nuts.length - 1);
    }
	public void qsort (String[] nuts, String[] bolts, NBComparator compare, int left, int right) {
		if (left > right) return;
		int part = partition (nuts, bolts[left], compare, left, right);
		partition (bolts, nuts[part], compare, left, right);
		qsort (nuts, bolts, compare, left, part - 1);
		qsort (nuts, bolts, compare, part + 1, right);
	}
	public int partition (String[] str, String pivot, NBComparator compare, int left, int right) {
		int m = left;
		for (int i = left + 1; i <= right; i ++) {
			if (compare.cmp(str[i], pivot) == -1 || compare.cmp(pivot, str[i]) == 1) {
				m ++;
				swap (str, m, i);
			} else if (compare.cmp(str[i], pivot) == 0 || compare.cmp(pivot, str[i]) == 0) {
				swap (str, left, i);
				i --;
			}
		}
		swap (str, left, m);
		return m;
	}
	public void swap (String[] str, int k, int t) {
		String temp = str[k];
		str[k] = str[t];
		str[t] = temp;
	}
}
