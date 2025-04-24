package dailyChallenges;

import java.util.HashMap;

public class leetcode2537 {
public long countGood(int[] nums, int k) {
        long res = 0;
        int left = 0;
        long pairs = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            int count = freq.getOrDefault(num, 0);
            pairs += count;
            freq.put(num, count + 1);

            // Shrink window from left until pairs < k
            while (pairs >= k) {
                res += nums.length - right;
                int leftNum = nums[left];
                int leftCount = freq.get(leftNum);
                freq.put(leftNum, leftCount - 1);
                pairs -= leftCount - 1;
                left++;
            }
        }

        return res;
    }
}
