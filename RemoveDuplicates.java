import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return "String is invalid";
        }

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "geEksforGEeks";
        System.out.println(removeDuplicates(str));
    }
}