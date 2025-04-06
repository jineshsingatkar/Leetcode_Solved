public class largestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if (n == 0) return List.of(); // Return an empty list if nums is empty

        // Sort the array to ensure the divisibility condition can be checked in order
        Arrays.sort(nums);

        // dp[i] will store the size of the largest divisible subset ending with nums[i]
        int[] dp = new int[n];
        int[] prev = new int[n]; // To reconstruct the subset
        Arrays.fill(dp, 1); // Each number is a subset of size 1 by itself
        Arrays.fill(prev, -1); // Initialize previous indices to -1

        int maxSize = 1; // Size of the largest divisible subset found so far
        int maxIndex = 0; // Index of the last element in the largest divisible subset

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1; // Update the size of the subset ending with nums[i]
                    prev[i] = j; // Store the previous index for reconstruction
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i]; // Update maxSize if a larger subset is found
                maxIndex = i; // Update maxIndex to the current index
            }
        }

        // Reconstruct the largest divisible subset
        List<Integer> result = new ArrayList<>();
        for (int i = maxIndex; i >= 0; i = prev[i]) {
            result.add(nums[i]); // Add the current number to the result
            if (prev[i] == -1) break; // Stop if there are no more previous indices
        }

        Collections.reverse(result); // Reverse to get the correct order
        return result;
    }

}
