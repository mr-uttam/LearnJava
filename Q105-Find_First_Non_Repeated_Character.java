public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String text = "programming";

        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(text.charAt(i)) == text.lastIndexOf(text.charAt(i))) {
                System.out.println(text.charAt(i));
                break;
            }
        }
    }
}
