package string.easy;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
		String ans = "";
		String[] sArray = s.split(" ");
		for (String str : sArray) {
			ans += reverse(str) + " ";
		}
		return ans.trim();
	}

	private String reverse(String s) {
		int start = 0, end = s.length() - 1;
		char temp;
		char[] sArray = s.toCharArray();
		while (start < end) {
			temp = sArray[start];
			sArray[start] = sArray[end];
			sArray[end] = temp;
			start++;
			end--;
		}
		return new String(sArray);
	}
}
