import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String text = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = ' ';
        int max = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > max) {
                max = map.get(ch);
                result = ch;
            }
        }

        System.out.println("Most Frequent Character = " + result);
    }
}
