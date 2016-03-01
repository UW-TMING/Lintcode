package Solution0_100;

import java.util.Arrays;
import java.util.Comparator;

class Node {
	int index;
	int val;
	public Node (int index, int val) {
		this.index = index;
		this.val = val;
	}
}

public class Solution_56 {
	public static void main (String[] args) {
		Solution_56 test = new Solution_56();
		int[] numbers = {1,2,33,23,2423,33,23,1,7,6,8787,5,33,2,3,-23,-54,-67,100,400};
		int target = 407;
		int[] ans = test.twoSum(numbers, target);
		for (int k : ans) {
			System.out.print(k + " ");
		}
	}
	
	public int[] twoSum(int[] numbers, int target) {
		int[] ans = new int[2];
		if (numbers == null) {
			return ans;
		}
		Node[] temp = new Node[numbers.length];
		for (int i = 0; i < numbers.length; i ++) {
			temp[i] = new Node(i, numbers[i]);
		}
		Arrays.sort(temp, new Comparator<Node>(){
			public int compare (Node n1, Node n2) {
				return n1.val - n2.val;
			}
		});
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (temp[i].val + temp[j].val == target) {
				ans[0] = temp[i].index > temp[j].index ? temp[j].index + 1 : temp[i].index + 1;
				ans[1] = temp[i].index > temp[j].index ? temp[i].index + 1 : temp[j].index + 1;;
				return ans;
			} else if (temp[i].val + temp[j].val < target) {
				i ++;
			} else {
				j --;
			}
		}
        return ans;
    }
}
