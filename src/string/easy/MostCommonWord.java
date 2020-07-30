package string.easy;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (String banWord : banned) {
			if (map.containsKey(banWord)) {
				map.remove(banWord);
			}
		}
		String res = null;
		for (String word : map.keySet())
			if (res == null || map.get(word) > map.get(res))
				res = word;
		return res;
	}
}
