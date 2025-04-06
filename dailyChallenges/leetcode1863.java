package dailyChallenges;
public class leetcode1863 {
    int result = 0;

    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n subsets
        for (int i = 0; i < totalSubsets; i++) {
            int xorSum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if the j-th bit is set in i
                    xorSum ^= nums[j]; // XOR the current number
                }
            }
            result += xorSum; // Add the XOR sum of the current subset to the result
        }
        return result;
    }
}

