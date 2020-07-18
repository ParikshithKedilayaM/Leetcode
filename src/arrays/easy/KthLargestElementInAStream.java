package arrays.easy;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
	int k;
	PriorityQueue<Integer> queue;

	public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>(k);
        for (int n : nums)
            add(n);
    }

	public int add(int val) {
		queue.offer(val);
		if (queue.size() > k) {
			queue.poll();
		}
		return queue.peek();
	}
}
