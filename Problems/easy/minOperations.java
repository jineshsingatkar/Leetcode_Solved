import java.util.HashSet;
import java.util.Set;

public class minOperations {
    public int calculateMinOperations(int[] nums, int k) {
         for (int num : nums) {
            if (num < k) {
                return -1; // Cannot increase values
            }
        }

        Set<Integer> greaterThanK = new HashSet<>();
        for (int num : nums) {
            if (num > k) {
                greaterThanK.add(num);
            }
        }

        return greaterThanK.size();

    }
}
