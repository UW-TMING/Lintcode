package Solution100_200;

public class Solution_160 {
	public static void main (String[] args) {
		Solution_160 test = new Solution_160();
		int[] num = {999, 999, 1000, 1000, 10000, 0, 999, 999, 999};
		System.out.println (test.findMin(num));
	}
	public int findMin(int[] num) {
		if (num == null || num.length == 0)  return 0;
		int left = 0;
		int right = num.length - 1;
		while (left + 1 < right) {
			int mid = (left + right) / 2;
			if (num[mid] < num[left]) {
				right = mid;
			} else if (num[mid] >= num[right])  {
				left = mid;
			}
		}
        return Math.min(num[left], num[right]);
    }
}
