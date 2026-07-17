public class CountNumberOfWords {
    public static void main(String[] args) {
        String text = "Java is an object oriented language";

        String[] words = text.split(" ");

        System.out.println("Total Words = " + words.length);
    }
}
