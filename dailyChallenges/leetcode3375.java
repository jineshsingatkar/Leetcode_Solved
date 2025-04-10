package dailyChallenges;
public class leetcode3375 {
    public int minOperations(int[] nums, int k) {
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
