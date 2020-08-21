package graphs.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class EmployeeImportance {
	class Employee {
		public int id;
		public int importance;
		public List<Integer> subordinates;
	};

	public int getImportance(List<Employee> employees, int id) {
		Map<Integer, Employee> map = new HashMap<>();
		for (Employee emp : employees) {
			map.put(emp.id, emp);
		}

		Queue<Employee> queue = new LinkedList<>();
		queue.offer(map.get(id));
		int importance = 0;
		while (!queue.isEmpty()) {
			int qSize = queue.size();
			for (int i = 0; i < qSize; i++) {
				Employee e = queue.poll();
				importance += e.importance;
				for (int empSub : e.subordinates) {
					queue.offer(map.get(empSub));
				}
			}
		}
		return importance;
	}
}
