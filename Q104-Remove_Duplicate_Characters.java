public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String text = "programming";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
