package Solution100_200;

import java.util.Arrays;
import java.util.Comparator;

class Pri {
	public int sum;
	public int index;
	public Pri (int sum, int index) {
		this.sum = sum;
		this.index = index;
	}
	public String toString () {
		return this.index + ", " + this.sum;
	}
}

public class Solution_139 {
	public static void main (String[] args) {
		int[] nums = {-10,-2,-3,-100,1,2,3,-1,4};
		new Solution_139().subarraySumClosest (nums);
	}
	public int[] subarraySumClosest(int[] nums) {
		if (nums == null || nums.length < 2) {
			return null;
		}
        int[] ans = new int[2];
        Pri[] presum = new Pri[nums.length + 1];
        presum[0] = new Pri (0, -1);
        for (int i = 0; i < nums.length; i ++) {
        		presum[i + 1] = new Pri (nums[i] + presum[i].sum, i);
        }
        Arrays.sort(presum, new Comparator<Pri>() {
        		public int compare (Pri a, Pri b) {
        			return a.sum - b.sum;
        		}
        });
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < presum.length; i ++) {
        		int temp = presum[i].sum - presum[i - 1].sum;
        		if (min > temp) {
        			min = temp;
        			int maxIndex = presum[i].index > presum[i - 1].index ? presum[i].index : presum[i - 1].index;
        			int minIndex = presum[i].index <= presum[i - 1].index ? presum[i].index : presum[i - 1].index;
        			ans[0] = minIndex + 1;
        			ans[1] = maxIndex;
        		}
        }
        return ans;
    }
}
