public class StringSort {
    public static String sortString(String str) {
        int freq[] = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                freq[i]--;
                sb.append((char) (i + 'a'));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("banana"));
    }
}
