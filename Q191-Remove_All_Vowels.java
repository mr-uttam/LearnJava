public class RemoveAllVowels {
    public static void main(String[] args) {
        String text = "Java Programming Language";

        String result = text.replaceAll("[AEIOUaeiou]", "");

        System.out.println(result);
    }
}
