package Solution100_200;

public class Solution_160 {
	public static void main (String[] args) {
		Solution_160 test = new Solution_160();
		int[] num = {999, 999, 1000, 1000, 10000, 0, 999, 999, 999};
		System.out.println (test.findMin(num));
	}
	public int findMin(int[] num) {
		if (num == null || num.length == 0)  return 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i ++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		return min;
    }
}
