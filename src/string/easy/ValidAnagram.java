package string.easy;

import java.util.Arrays;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return (new String(sArray)).equals(new String(tArray));
	}
}
