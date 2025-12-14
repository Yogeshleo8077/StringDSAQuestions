import java.util.HashMap;

public class MostFrequentCharacter {
    public static char mostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxFreq = 0;
        for (int count : map.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == maxFreq) {
                return ch;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println(mostFrequentCharacter(str));
    }
}
