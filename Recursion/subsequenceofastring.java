// Print all the subsequence of a String.
// Time complexity - O(2^n)

public class subsequenceofastring {
    public static void subsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // if add
        subsequence(str, idx + 1, newString + currChar);

        // if not add
        subsequence(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "AB";
        subsequence(str, 0, "");
    }
}
