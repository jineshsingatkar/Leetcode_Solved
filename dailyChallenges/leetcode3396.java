package dailyChallenges;

import java.util.HashSet;
import java.util.Set;

public class leetcode3396 {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        int i = 0;

        while (i < nums.length) {
            Set<Integer> seen = new HashSet<>();
            boolean hasDuplicate = false;
            for (int j = i; j < nums.length; j++) {
                if (seen.contains(nums[j])) {
                    hasDuplicate = true;
                    break;
                }
                seen.add(nums[j]);
            }

            if (!hasDuplicate) {
                break;
            }
            operations++;
            i += 3;
        }

        return operations;
    }
}

