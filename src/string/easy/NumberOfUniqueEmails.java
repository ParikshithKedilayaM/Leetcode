package string.easy;

import java.util.HashMap;

public class NumberOfUniqueEmails {
	public int numUniqueEmails(String[] emails) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String email : emails) {
			String domain = email.split("@")[1];
			String localName = email.split("@")[0];
			if (localName.contains("+")) {
				localName = localName.split("[+]")[0];
			}
			if (localName.contains(".")) {
				String[] lNames = localName.split("[.]");
				localName = "";
				for (String lName : lNames) {
					localName += lName;
				}
			}
			email = localName + "@" + domain;
			if (map.containsKey(email)) {
				map.put(email, map.getOrDefault(email, 0) + 1);
			} else {
				map.put(email, 1);
			}
		}
		return map.size();
	}
}
