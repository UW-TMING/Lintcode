package solution400_500;

import java.util.Stack;

public class Solution_421_2 {
	public static void main (String[] args) {
		String path = "/home//foo/";
		Solution_421_2 test = new Solution_421_2();
		System.out.println (test.simplifyPath(path));
	}
	public String ans = "/";
	public String simplifyPath(String path) {
        if (path == null || path.length() == 0) return "";
        Stack<String> stack = new Stack<String> ();
        String[] str = path.split("/");
        for (int i = 0; i < str.length; i ++) {
        		if (str[i].equals("..")) {
        			if (!stack.empty()) stack.pop();
        		} else if (str[i].equals(".") || str[i].equals("")) {
        			
        		} else {
        			stack.add(str[i]);
        		}
        }
        printStack(stack);
        if (ans.length() > 1) {
        		ans = ans.substring(0, ans.length() - 1);
        }
        return ans;
    }
	public void printStack (Stack<String> stack) {
		if (!stack.empty()) {
			String temp = stack.pop();
			printStack (stack);
			ans += temp + "/";
		}
	}
}
