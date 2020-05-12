package arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareStringByFrequencyOfSmallestCharacter {
	class Solution {
		Map<String, Integer> map = new HashMap<>();

		public int[] numSmallerByFrequency(String[] queries, String[] words) {

			List<Integer> list = new ArrayList<>();
			calcFreq(queries);
			calcFreq(words);
			int count = 0;
			for (String s : queries) {
				for (String str : words) {
					if (map.get(s) < map.get(str)) {
						count++;
					}

				}
				list.add(count);
				count = 0;
			}

			int[] res = new int[list.size()];

			for (int i = 0; i < list.size(); i++) {
				res[i] = list.get(i);
			}

			return res;
		}

		public void calcFreq(String[] queries) {
			int[] freq = new int[26];

			int fofs = 0;
			for (String s : queries) {
				for (char c : s.toCharArray()) {
					freq[c - 'a'] += 1;

				}

				for (int i = 0; i < 26; i++) {
					if (freq[i] != 0) {
						fofs = freq[i];
						map.put(s, fofs);
						break;
					}
				}
				freq = new int[26];
			}
		}

	}
}
