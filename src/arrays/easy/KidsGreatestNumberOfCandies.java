package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> outputList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int i=0; i < candies.length; i++) {
            outputList.add(false);
            if (candies[i] + extraCandies >= max) {
                outputList.set(i, true);
            }
        }
        return outputList;
    }
}
