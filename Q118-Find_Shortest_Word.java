public class FindShortestWord {
    public static void main(String[] args) {
        String text = "Java is an object oriented programming language";

        String[] words = text.split(" ");

        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Shortest Word = " + shortest);
    }
}
