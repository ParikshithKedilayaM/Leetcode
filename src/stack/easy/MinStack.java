package stack.easy;

import java.util.Stack;

public class MinStack {

	/** initialize your data structure here. */
	Stack<Integer> stack;
	int min;

	public MinStack() {
		stack = new Stack<>();
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}

	public void pop() {
		if (!stack.isEmpty()) {
			if (stack.pop() == min) {
				min = stack.pop();
			}
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}
