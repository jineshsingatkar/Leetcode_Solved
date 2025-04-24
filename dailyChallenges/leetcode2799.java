public class leetcode2799 {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        int totalUnique = uniqueSet.size();

        int left = 0, count = 0;
        HashMap<Integer, Integer> windowMap = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            windowMap.put(nums[right], windowMap.getOrDefault(nums[right], 0) + 1);

            while (windowMap.size() == totalUnique) {
                // Number of complete subarrays ending at 'right'
                count += nums.length - right;
                // Move left pointer
                windowMap.put(nums[left], windowMap.get(nums[left]) - 1);
                if (windowMap.get(nums[left]) == 0) {
                    windowMap.remove(nums[left]);
                }
                left++;
            }
        }

        return count;
    }

}
