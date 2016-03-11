package Solution0_100;

import java.util.ArrayList;

public class Solution_50 {
	public static void main (String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer> ();
		A.add(1); A.add(2); A.add(3);
		Solution_50 test = new Solution_50 ();
		ArrayList<Long> ans = test.productExcludeItself(A);
		for (Long l : ans) {
			System.out.println (l);
		}
	}
	public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
		 ArrayList<Long> ans = new ArrayList<Long> ();
		 if (A == null || A.size() == 0) return ans;
		 long product = 1;
		 ans.add(getVal(0, A));
		 for (int i = 1; i < A.size(); i ++) {
			 int val = A.get(i);
			 if (val != 0) {
				 ans.add((A.get(i - 1) * ans.get(i - 1)) / val);
			 } else {
				 ans.add(getVal(i, A));
			 }
		 }
		 return ans;
	 }
	 public long getVal (int index, ArrayList<Integer> A) {
		 long product = 1;
		 for (int i = 0; i < A.size(); i ++) {
			 if (i != index) {
				 product *= A.get(i);
			 }
		 }
		 return product;
	 }
}
