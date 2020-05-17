package hashtable.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisitCount {
	public List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> result = new ArrayList<>();
		for (String cpdomain : cpdomains) {
			int count = Integer.parseInt(cpdomain.split(" ")[0]);
			String domain = cpdomain.split(" ")[1];
			while (!domain.equals("")) {
				if (map.containsKey(domain)) {
					map.put(domain, map.getOrDefault(domain, 0) + count);
				} else {
					map.put(domain, count);
				}
				if (domain.contains("."))
					domain = domain.substring(domain.indexOf(".") + 1);
				else
					domain = "";
			}

		}
		for (String domain : map.keySet()) {
			result.add("" + map.get(domain) + " " + domain);
		}
		return result;
	}
}
