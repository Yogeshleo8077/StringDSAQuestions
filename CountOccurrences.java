public class CountOccurrences {
    public static int countOccurrences(String str, String sub) {
        if (str == null || sub == null || sub.length() == 0 || str.length() < sub.length()) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        String str = "abababa";
        String sub = "aba";
        System.out.println(countOccurrences(str, sub)); // Output: 3
    }
}