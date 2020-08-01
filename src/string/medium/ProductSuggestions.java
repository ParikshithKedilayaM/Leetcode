package string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSuggestions {
	class Solution {
		public List<List<String>> suggestedProducts(String[] products, String searchWord) {
			Arrays.sort(products);
			List<List<String>> result = new ArrayList<>();
			for (int i = 1; i <= searchWord.length(); i++) {
				String searchString = searchWord.substring(0, i);
				List<String> searchRes = searchProducts(products, searchString);
				result.add(searchRes);
			}
			return result;
		}

		private List<String> searchProducts(String[] products, String searchString) {
			int max = 0;
			List<String> res = new ArrayList<String>();
			for (String str : products) {
				if (str.startsWith(searchString)) {
					res.add(str);
					max++;
				}
				if (max == 3) {
					break;
				}
			}
			return res;
		}
	}
}
