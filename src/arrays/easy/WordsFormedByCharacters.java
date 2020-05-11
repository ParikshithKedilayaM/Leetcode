package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class WordsFormedByCharacters {
	public int countCharacters(String[] words, String chars) {
		int count = 0, tempCounter = 0;
		List<Character> list = new ArrayList<Character>();

		for (char chr : chars.toCharArray()) {
			list.add(chr);
		}
		for (String word : words) {
			char[] wr = word.toCharArray();
			tempCounter = 0;
			List<Character> tempList = new ArrayList<Character>(list);
			for (char c : wr) {
				if (!tempList.contains(c)) {
					tempCounter = 0;
					break;
				}
				tempList.remove(Character.valueOf(c));
				tempCounter++;
			}
			count += tempCounter;
		}
		return count;
	}
}
