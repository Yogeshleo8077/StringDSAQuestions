public class IsSubString {

    public static boolean isSubStringBuiltIn(String str, String sub) {
        if (str == null || sub == null) {
            return false;

        }

        return str.contains(sub);
    }

    // without built-in method
    public static boolean isSubString(String str, String sub) {
        if (str == null || sub == null) {
            return false;
        }

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            if (j == sub.length()) {
                return true; // match found
            }
        }

        return false; // no match found
    }

    public static void main(String args[]) {
        String str = "hello world";
        String sub = "world";

        // System.out.println(isSubString(str, sub));
        System.out.println(isSubStringBuiltIn(str, sub));
    }
}