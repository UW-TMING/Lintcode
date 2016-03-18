package solution400_500;

import java.util.Stack;

public class Solution_423 {
	public static void main (String[] args) {
		String s = "()";
		Solution_423 test = new Solution_423 ();
		System.out.println (test.isValidParentheses(s));
	}
	public boolean isValidParentheses(String s) {
		if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character> ();
        for (int i = 0; i < s.length(); i ++) {
        		char c = s.charAt(i);
        		if (c == '(' || c == '{' || c == '[') {
        			stack.push(c);
        		} else {
        			if (stack.empty()) {
        				return false;
        			} else {
        				char top = stack.pop();
        				if (!compare(top, c)) return false; 
        			}
        		}
        }
        if (stack.empty()) return true; 
        return false;
    }
	public boolean compare (char c1, char c2) {
		if (c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' || c2 == '}') {
			return true;
		}
		return false;
	}
}
