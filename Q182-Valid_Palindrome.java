public class ValidPalindrome {
    public static void main(String[] args) {
        String text = "A man, a plan, a canal: Panama";

        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = new StringBuilder(text).reverse().toString();

        if (text.equals(reverse)) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not a Valid Palindrome");
        }
    }
}
