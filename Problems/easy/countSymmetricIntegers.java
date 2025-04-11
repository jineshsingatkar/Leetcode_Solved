public class countSymmetricIntegers {
        public int leetcodecountSymmetricIntegers(int low, int high) {
        int ans = 0;
    
        for (int num = low; num <= high; ++num)
          if (isSymmetricInteger(num))
            ++ans;
    
        return ans;
      }
    
      private boolean isSymmetricInteger(int num) {
        if (num >= 10 && num <= 99)
          return num / 10 == num % 10;
        if (num >= 1000 && num <= 9999) {
          final int left = num / 100;
          final int right = num % 100;
          return left / 10 + left % 10 == right / 10 + right % 10;
        }
        return false;
      }
    }
// This code defines a class `countSymmetricIntegers` with two methods: `leetcodecountSymmetricIntegers` and `isSymmetricInteger`.
// The `leetcodecountSymmetricIntegers` method counts the number of symmetric integers in a given range [low, high].
// A symmetric integer is defined as a number that has the same sum of its digits in the left half and right half when split in half.
