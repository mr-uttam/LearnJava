public class CountNumberOfSentences {
    public static void main(String[] args) {
        String text = "Java is easy. It is powerful. Learn Java!";

        String[] sentences = text.split("[.!?]");

        System.out.println("Total Sentences = " + sentences.length);
    }
}
