import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void printDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Not a valid string.");
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " => " + e.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        printDuplicates(str);
    }
}
