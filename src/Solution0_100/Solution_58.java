package Solution0_100;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_58 {
	public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
        if (numbers == null || numbers.length < 4) {
        		return ans;
        }
        Arrays.sort(numbers);
        int len = numbers.length;
        for (int i = 0; i < len - 3; i ++) {
        		if (i != 0 && numbers[i] == numbers[i - 1]) {
        			continue;
        		}
        		for (int j = i + 1; j < len - 2; j ++) {
        			if (j != i + 1 && numbers[j] == numbers[j - 1]) {
        				continue;
        			}
        			int left = j + 1;
        			int right = len - 1;
        			while (left < right) {
        				int sum = numbers[i] + numbers[j] + numbers[left] + numbers[right];
        				if (sum == target) {
        					ArrayList<Integer> al = new ArrayList<Integer> ();
        					al.add(numbers[i]);
        					al.add(numbers[j]);
        					al.add(numbers[left]);
        					al.add(numbers[right]);
        					ans.add(al);
        					left ++;
        					right --;
        					while (left < right && numbers[left] != numbers[left - 1]) {
        						left ++;
        					}
        					while (left < right && numbers[right] != numbers[right + 1]) {
        						right --;
        					}
        				} else if (sum < target) {
        					left ++;
        				} else {
        					right --;
        				}
        			}
        		}
        }
        return ans;
    }
}
