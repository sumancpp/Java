public class permutationofastring {

    public static void printpermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permutation + currChar);
        }
    }
 
    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, "");
    }
}
