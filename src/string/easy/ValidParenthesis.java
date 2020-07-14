package string.easy;

import java.util.Stack;

public class ValidParenthesis {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && (c == ')' && stack.peek() == '(' || c == '}' && stack.peek() == '{'
					|| c == ']' && stack.peek() == '[')) {
				stack.pop();

			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
