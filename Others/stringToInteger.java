package Others;

public class stringToInteger {
    public static void main(String[] args) {
        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println("Integer value: " + num);
    }
    public static int stringToInteger(String str) {
        return Integer.parseInt(str);
    }

}
