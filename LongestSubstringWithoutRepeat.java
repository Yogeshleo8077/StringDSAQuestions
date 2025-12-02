import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static int longestSubstringWithoutRepeat(String str) {
        // Edge case: empty string
        if (str.length() == 0) {
            return 0;
        }

        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            while (set.contains(ch)) {
                char leftChar = str.charAt(left);
                set.remove(leftChar);
                left++;
            }

            set.add(ch);

            int windowSize = right - left + 1;
            if (windowSize > maxLen) {
                maxLen = windowSize;
            }
        }

        return maxLen;

    }

    public static void main(String args[]) {
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";

        System.out.println(longestSubstringWithoutRepeat(str1)); // 3
        System.out.println(longestSubstringWithoutRepeat(str2)); // 1
        System.out.println(longestSubstringWithoutRepeat(str3)); // 3
    }
}