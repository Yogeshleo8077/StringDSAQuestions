public class LexicographicalComparison {
    public static int compareStrings(String s1, String s2) {
        int i = 0;

        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
            i++;
        }

        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String s1 = "bat";
        String s2 = "ball";

        int result = compareStrings(s1, s2);

        if (result > 0) {
            System.out.println(s2 + " comes first");
        } else if (result < 0) {
            System.out.println(s1 + "comes first");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}