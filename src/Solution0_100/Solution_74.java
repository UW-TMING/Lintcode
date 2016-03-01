package Solution0_100;

class SVNRepo {
	public static boolean isBadVersion(int k) {
		return true;
	}
}
public class Solution_74 {
	public int findFirstBadVersion(int n) {
		int ans = -1;
        if (n <= 0) return ans;
        int left = 0;
        int right = n;
        while (left <= right) {
        		int mid = (left + right) / 2;
        		if (SVNRepo.isBadVersion(mid)) {
        			ans = mid;
        			right = mid - 1;
        		}
        		if (!SVNRepo.isBadVersion(mid)) left = mid - 1;
        }
        return ans;
    }
}
