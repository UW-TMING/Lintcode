package solution400_500;

public class Solution_421 {
	public static void main (String[] args) {
		Solution_421 test = new Solution_421 ();
		String path = "/a/./b/../../c/";
		String[] paths = path.split("/");
		for (String temp : paths) {
			System.out.println ("->" + temp + "<-");
		}
	}
	public String simplifyPath(String path) {
        return "";
    }
}
