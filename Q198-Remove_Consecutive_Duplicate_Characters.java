public class RemoveConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        String text = "aaabbbccdaa";

        StringBuilder result = new StringBuilder();

        result.append(text.charAt(0));

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(i - 1)) {
                result.append(text.charAt(i));
            }
        }

        System.out.println(result);
    }
}
