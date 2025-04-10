public class leetcode2999 {
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        long count = 0;

        for (long i = start; i <= finish; i++) {
            String numStr = Long.toString(i);

            // Check if the number ends with string s
            if (numStr.endsWith(s)) {
                // Check if all digits are <= limit
                if (allDigitsLessThanOrEqual(numStr, limit)) {
                    count++;
                }
            }
        }

        return count;
    }

    // ✅ This method is outside of numberOfPowerfulInt, but still inside the class
    private boolean allDigitsLessThanOrEqual(String numStr, int limit) {
        for (char c : numStr.toCharArray()) {
            int digit = c - '0';
            if (digit > limit) {
                return false;
            }
        }
        return true;
    }
}


