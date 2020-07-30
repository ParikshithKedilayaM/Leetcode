package string.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		paranthesis(res, "", 0, 0, n);
		return res;
	}

	private void paranthesis(List<String> list, String str, int open, int close, int max) {
        if (str.length() == 2 * max) {
            list.add(str);
            return;
        }
        if (open < max) {
            paranthesis(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            paranthesis(list, str + ")", open, close + 1, max);
        }
	}
}
