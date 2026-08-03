public class PrintAllStringPermutations {
    public static void main(String[] args) {
        permutation("ABC", "");
    }

    static void permutation(String text, String answer) {
        if (text.length() == 0) {
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            String left = text.substring(0, i);
            String right = text.substring(i + 1);

            permutation(left + right, answer + ch);
        }
    }
}
