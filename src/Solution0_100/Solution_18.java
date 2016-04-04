package Solution0_100;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_18 {
	public static void main(String[] args) {
		ArrayList<Integer> S = new ArrayList<Integer> ();
		S.add(1);
		S.add(3);
		S.add(2);
		subsetsWithDup(S);
	}
	public static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
 	public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
 		if(S == null || S.size() == 0) return ans;
 		Collections.sort(S);
		ArrayList<Integer> sol = new ArrayList<Integer> ();
		ans.add(new ArrayList<Integer> (sol));
		put(0, sol, S);
		return ans;
    }
 	public static void put(int index, ArrayList<Integer> sol, ArrayList<Integer> S) {
 		for(int i = index; i < S.size(); i++) {
 			if(i != index && S.get(i) == S.get(i - 1)) {
 				continue;
 			}
 			sol.add(S.get(i));
			ans.add(new ArrayList<Integer> (sol));
			put(i + 1, sol, S);
			sol.remove(sol.size() - 1);
 		}
 	}
 	
}
