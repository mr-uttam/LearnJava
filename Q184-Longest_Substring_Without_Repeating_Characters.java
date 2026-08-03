import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String text = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < text.length(); right++) {
            while (set.contains(text.charAt(right))) {
                set.remove(text.charAt(left));
                left++;
            }

            set.add(text.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Length = " + maxLength);
    }
}
