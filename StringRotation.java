public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab")); // true
        System.out.println(isRotation("abcd", "acbd")); // false
    }
}
