package Solution100_200;

public class Solution_143 {
	public static void main (String[] args) {
		Solution_143 test = new Solution_143();
		int[] colors = {2,1,1,2,2};
		int k = 2;
		test.sortColors2(colors, k);
	}
	public void sortColors2(int[] colors, int k) {
		if (colors == null || colors.length == 0) return;
		int start = 0;
		int end = colors.length - 1;
		int count = 1;
		while (count < k) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = start; i <= end; i ++) {
				if (min > colors[i]) min = colors[i];
				if (max < colors[i]) max = colors[i];
			}
//System.out.println ("min--->" + min + "   max--->" + max);
			for (int i = start; i <= end;) {
				if (colors[i] == min) {
					swap (colors, i, start);
					start ++;
					i ++;
				} else if (colors[i] == max) {
					swap (colors, i, end);
					end --;
				} else {
					i ++;
				}
			}
			end = end - 1;
			count += 2;
		}
    }
	public void swap (int[] colors, int i, int j) {
		int temp = colors[i];
		colors[i] = colors[j];
		colors[j] = temp;
	}
}
