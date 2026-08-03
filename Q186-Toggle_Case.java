public class ToggleCase {
    public static void main(String[] args) {
        String text = "Java Programming";

        String result = "";

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
