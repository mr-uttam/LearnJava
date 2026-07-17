public class CapitalizeFirstLetterOfEachWord {
    public static void main(String[] args) {
        String text = "java programming language";

        String[] words = text.split(" ");

        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1)
                    + " ";
        }

        System.out.println(result.trim());
    }
}
