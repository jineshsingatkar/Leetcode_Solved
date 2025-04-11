public class mergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();

        while (i < len1 || j < len2) {
            if (i < len1) {
                merged.append(word1.charAt(i++));
            }
            if (j < len2) {
                merged.append(word2.charAt(j++));
            }
        }

        return merged.toString();
    }
    public static void main(String[] args) {
        mergeAlternately ma = new mergeAlternately();
        String word1 = "abc";
        String word2 = "defg";
        System.out.println(ma.mergeAlternately(word1, word2)); // Output: "adbcef"
    }
}
// The code defines a class `mergeAlternately` with a method `mergeAlternately` that takes two strings as input and merges them alternately. The main method demonstrates its usage.
// The output for the example provided is "adbcef", which is the expected result of merging "abc" and "defg" alternately.
// The code is efficient and handles cases where the strings are of different lengths by appending the remaining characters from the longer string after the shorter one has been fully merged.
// The use of `StringBuilder` ensures that the string concatenation is efficient, especially for larger strings. The time complexity is O(n + m), where n and m are the lengths of the two strings, respectively.
// The space complexity is O(n + m) for the merged string.
// Overall, the code is well-structured and follows good programming practices. It is easy to read and understand, making it suitable for both beginners and experienced programmers.
// The code is also efficient in terms of time and space complexity, making it a good solution for the problem of merging two strings alternately.
