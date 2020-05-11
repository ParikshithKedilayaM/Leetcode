package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	public List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<>();

		for (char c = 'a'; c <= 'z'; c++) {
			if (!A[0].contains(Character.toString(c))) {
				continue;
			}
			int minCount = Integer.MAX_VALUE;
			for (String s : A) {
				int wordCount = 0;
				for (char cur_c : s.toCharArray())
					if (cur_c == c)
						wordCount++;
				minCount = Math.min(minCount, wordCount);
			}

			for (int i = 0; i < minCount; i++)
				result.add("" + c);
		}

		return result;
	}
}
