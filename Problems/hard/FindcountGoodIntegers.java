package Problems.hard;

public class FindCountGoodIntegers {
    public int countGoodIntegers(int n, int k) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (isGoodInteger(i, k)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGoodInteger(int num, int k) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum == k;
    }
}
