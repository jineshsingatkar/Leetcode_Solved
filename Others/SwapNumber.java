package Others;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void swap(int a, int b) {
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of b from the sum to get the original value of a
        a = a - b; // Step 3: Subtract the new value of a from the sum to get the original value of b
    }

}
