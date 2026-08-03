public class ReverseEachWord {
    public static void main(String[] args) {
        String text = "Java Programming Language";

        String[] words = text.split(" ");

        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            System.out.print(builder.reverse() + " ");
        }
    }
}
