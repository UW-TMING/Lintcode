package Solution100_200;

public class Solution_159 {
	public static void main (String[] args) {
		Solution_159 test = new Solution_159();
		int[] num = {6, 1, 2, 3, 4, 5};
		System.out.println (test.findMin(num));
	}
	public int findMin(int[] num) {
		if (num == null || num.length == 0)  return 0;
		int left = 0;
		int right = num.length - 1;
		while (left + 1 < right) {
			if (num[left] < num[right]) return num[left];
			int mid = (left + right) / 2;
			if (num[mid] > num[right]) {
				left = mid;
			} else if (num[mid] < num[left]) {
				right = mid;
			}
		}
        return Math.min(num[left], num[right]);
    }
}
