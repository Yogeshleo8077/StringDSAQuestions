public class IsSubSequence {

    public static boolean isSubSequence(String str, String sub) {
        if (str == null || sub == null) {
            return false;
        }

        if (sub.length() == 0) {
            return true;
        }

        int i = 0;
        int j = 0;

        while (i != str.length() && j != sub.length()) {
            if (str.charAt(i) == sub.charAt(j)) {
                j++;
            }
            i++; // always move main string pointer
        }

        if (j == sub.length()) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        System.out.println(isSubSequence("abcdef", "ace")); // true
        System.out.println(isSubSequence("abcdef", "aec")); // false
        System.out.println(isSubSequence("abc", "abc")); // true
        System.out.println(isSubSequence("abc", "")); // true
    }
}