public class ConvertToUpperCase {
    public static String toUpperCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(toUpperCase(str));
    }
}
