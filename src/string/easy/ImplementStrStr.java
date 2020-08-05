package string.easy;

public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		int needleSize = needle.length();
		if (needleSize == 0)
			return 0;
		if (needleSize == 1 || needleSize == haystack.length())
			return haystack.indexOf(needle);
		int needleFirstOccurance = -1;
		for (int i = 0; i <= haystack.length() - needleSize; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (needle.equals(haystack.substring(i, i + needleSize))) {
					needleFirstOccurance = i;
					break;
				}
			}
		}
		return needleFirstOccurance;
	}
}
