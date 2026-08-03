public class RunLengthEncoding {
    public static void main(String[] args) {
        String text = "aaabbccccdd";

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                result.append(text.charAt(i));
                result.append(count);
                count = 1;
            }
        }

        System.out.println(result);
    }
}
