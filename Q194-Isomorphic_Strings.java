import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String first = "egg";
        String second = "add";

        if (isIsomorphic(first, second)) {
            System.out.println("Isomorphic Strings");
        } else {
            System.out.println("Not Isomorphic Strings");
        }
    }

    static boolean isIsomorphic(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            char a = first.charAt(i);
            char b = second.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false;
                }
            } else {
                if (map.containsValue(b)) {
                    return false;
                }
                map.put(a, b);
            }
        }

        return true;
    }
}
