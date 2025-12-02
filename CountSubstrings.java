public class CountSubstrings {
    public static int subStringCount(String str, int n) {
        int totalNumOfSubStr = n * (n + 1) / 2;
        return totalNumOfSubStr;
    }

    // time complexity - O(1) becasue just 1 formula
    public static void main(String args[]) {
        String str = "abcdef";
        int n = str.length();
        System.out.println("Total SubStrings: " + subStringCount(str, n));
    }
}