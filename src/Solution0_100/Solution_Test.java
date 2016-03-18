package Solution0_100;

public class Solution_Test {
	public static void main (String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int k = 5;
		operate(a, k, a.length);
		for (int t : a) {
			System.out.println (t);
		}
	}
	public static void reserve (int[] a, int left, int right) {
		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left ++;
			right --;
		}
	}
	public static void operate (int[] a, int k, int len) {
		k = k % len;
		reserve (a, 0, len - k - 1);
		reserve (a, len - k, len - 1);
		reserve (a, 0, len - 1);
	}
}
