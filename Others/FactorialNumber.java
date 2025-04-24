package Others;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

}
