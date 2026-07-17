public class CountWordsInString {
    public static void main(String[] args) {
        String text = "Java is easy to learn";

        String[] words = text.split(" ");

        System.out.println("Words = " + words.length);
    }
}
