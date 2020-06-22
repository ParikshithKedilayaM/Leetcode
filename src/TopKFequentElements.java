import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFequentElements {
	public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k]; 
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );
        for (int n :  map.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }
        for (int i=k-1; i>=0; i--) {
            result[i] = heap.poll();
        }
        return result;
    }
}
