public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String text = "Java@123#Programming!";

        System.out.println(text.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
