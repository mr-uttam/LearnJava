public class ReverseWordsInString {
    public static void main(String[] args) {
        String text = "Java Programming Language";

        String[] words = text.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
