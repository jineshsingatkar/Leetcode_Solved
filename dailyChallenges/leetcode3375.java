package dailyChallenges;

import java.util.HashSet;
import java.util.Set;

public class leetcode3375 {
    public int minOperations(int[] nums, int k) {
        // Validate input
        if (nums == null || nums.length == 0) {
            return -1; // Invalid input
        }

        Set<Integer> requiredNumbers = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            requiredNumbers.add(i);
        }

        int operations = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (requiredNumbers.contains(nums[i])) {
                requiredNumbers.remove(nums[i]);
            }
            operations++;
            if (requiredNumbers.isEmpty()) {
                return operations;
            }
        }

        return -1; // Not possible to achieve the condition
    }
}