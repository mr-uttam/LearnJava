public class ConvertStringToCharacterArray {
    public static void main(String[] args) {
        String text = "Java";

        char[] characters = text.toCharArray();

        for (char ch : characters) {
            System.out.println(ch);
        }
    }
}
