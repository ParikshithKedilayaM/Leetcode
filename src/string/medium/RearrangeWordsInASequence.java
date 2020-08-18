package string.medium;

import java.util.Arrays;

public class RearrangeWordsInASequence {
	public String arrangeWords(String text) {
		text = text.toLowerCase();
		String[] strings = text.split(" ");
		Arrays.sort(strings, (a, b) -> a.length() - b.length());
		StringBuilder sb = new StringBuilder();
		for (String str : strings) {
			sb.append(str).append(" ");
		}
		sb.setCharAt(0, (char) ('A' + sb.charAt(0) - 'a'));
		return sb.toString().trim();
	}
}
