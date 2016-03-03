package Solution500_600;

public class Solution_508 {
	public int midVal;
	public static void main (String[] args) {
		int[] nums = {2, 1};
		Solution_508 test = new Solution_508 ();
		test.wiggleSort(nums);
		printNums (nums);
	}
	public static void printNums (int[] nums) {
		for (int k : nums) {
			System.out.print (k + " ");
		}
		System.out.println ("\n==============");
	}
	public void wiggleSort(int[] nums) {
		if (nums == null || nums.length < 2) return;
		int len = nums.length;
		int start = 0;
		int end = len;
		int k =  (start + end) / 2;
		findMiddle(nums, start, len - 1, k);
		int[] ans = new int[nums.length];
		for (int t = 0; t < ans.length; t ++) {
			ans[t] = midVal;
		}
		int i = 1;
		int j = len - 1;
		if (len % 2 == 0) j = len - 2;
		for (int t = 0; t < nums.length; t ++) {
			if (nums[t] < midVal) {
				ans[j] = nums[t];
				j -= 2;
			} else if (nums[t] > midVal) {
				ans[i] = nums[t];
				i += 2;
			}
		}
		for (int t = 0; t < ans.length; t ++) {
			nums[t] = ans[t];
		}
    }
	public void findMiddle (int[] nums, int start, int end, int k) {
		if (start > end) return;
		int left = start;
		int right = end;
		int temp = nums[left];
		while (left < right) {
			while (left < right && nums[right] >= temp) right --;
			nums[left] = nums[right];
			while (left < right && nums[left] < temp) left ++;
			nums[right] = nums[left];
		}
		nums[left] = temp;
		if (left == k) {
//			printNums (nums);
			midVal = temp;
			return ;
		}
		findMiddle (nums, start, left - 1, k);
		findMiddle (nums, left + 1, end, k);
	}
}
