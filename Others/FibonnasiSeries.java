package Others;

public class FibonnasiSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
