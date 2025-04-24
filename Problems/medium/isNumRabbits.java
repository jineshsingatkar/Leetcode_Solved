package Problems.medium;

import java.util.HashMap;
import java.util.Map;

public class isNumRabbits {
public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for (int answer : answers) {
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }

        for (int x : map.keySet()) {
            int count = map.get(x);
            int groupSize = x + 1;
            int groups = (count + groupSize - 1) / groupSize; // ceiling
            total += groups * groupSize;
        }

        return total;
    }
}
