package Problems.hard;

public class MaximumProductOfSubsequencesWithAnAlternatingSumEqualToK {
    private int maxProduct = -1;
    public int maxProduct(int[] nums, int k, int limit) {

        dfs(nums, 0, 0, 1, k, limit); 

        return maxProduct;
    }
    private void dfs(int[] nums, int idx, int altSum, int product, int k, int limit) {

        if (product > limit) {
            return;
        }

        if (idx > 0 && altSum == k) {
            maxProduct = Math.max(maxProduct, product);
        }

        if (idx == nums.length) {
            return;
        }
        int sign = (idx % 2 == 0) ? 1 : -1; 

        dfs(nums, idx + 1, altSum + sign * nums[idx], product * nums[idx], k, limit);

        dfs(nums, idx + 1, altSum, product, k, limit);
    }
}

