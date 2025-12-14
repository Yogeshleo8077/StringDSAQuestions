import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static List<String> commonElements(String[] arr) {
        int freq[] = new int[26];
        for (char ch : arr[0].toCharArray()) {
            freq[ch - 'a']++;
        }

        // rest of the words
        for (int i = 1; i < arr.length; i++) {
            int temp[] = new int[26];

            for (char ch : arr[i].toCharArray()) {
                temp[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], temp[j]);
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                freq[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = { "bella", "label", "roller" };

        System.out.println(commonElements(words));
    }
}
