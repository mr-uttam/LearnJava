public class StringCompression {
    public static void main(String[] args) {
        String text = "aaabbccccdd";

        String compressed = "";

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                compressed += text.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        System.out.println(compressed);
    }
}
