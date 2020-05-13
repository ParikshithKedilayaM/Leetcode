package arrays.easy;

public class DistanceBetweenBusStops {
	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int firstDistance = 0;
		int secondDistance = 0;

		/* Check one way (from start to destination) */
		for (int i = start; i != destination; i = (i + 1) % distance.length) {
			firstDistance += distance[i];
		}

		/* Check other way (from destination to start) */
		for (int i = destination; i != start; i = (i + 1) % distance.length) {
			secondDistance += distance[i];
		}

		return Math.min(firstDistance, secondDistance);
	}
}
