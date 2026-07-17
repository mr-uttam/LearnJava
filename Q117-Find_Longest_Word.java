public class FindLongestWord {
    public static void main(String[] args) {
        String text = "Java is an object oriented programming language";

        String[] words = text.split(" ");

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Word = " + longest);
    }
}
