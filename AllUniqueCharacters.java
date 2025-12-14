import java.util.HashMap;

public class AllUniqueCharacters {
    public static boolean checkUnique(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "abbcd";
        System.out.println(checkUnique(str));
    }
}
