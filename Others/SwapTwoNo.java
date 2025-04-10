package Others;

public class SwapTwoNo {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
    }

    public static void swap(int a, int b) {
        // Using XOR to swap two numbers without using a temporary variable
        a = a ^ b; // Step 1: a now holds the XOR of a and b
        b = a ^ b; // Step 2: b now holds the original value of a
        a = a ^ b; // Step 3: a now holds the original value of b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    // This method is outside of swap, but still inside the class
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap(int a, int b) {
        a = a + b; // Step 1: a now holds the sum of a and b
        b = a - b; // Step 2: b now holds the original value of a
        a = a - b; // Step 3: a now holds the original value of b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public static void swap(int a, int b) {
        a = a * b; // Step 1: a now holds the product of a and b
        b = a / b; // Step 2: b now holds the original value of a
        a = a / b; // Step 3: a now holds the original value of b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public static void swap(int a, int b) {
        a = a - b; // Step 1: a now holds the difference of a and b
        b = a + b; // Step 2: b now holds the original value of a
        a = b - a; // Step 3: a now holds the original value of b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
