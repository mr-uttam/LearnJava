public class CheckPalindromeString {
    public static void main(String[] args) {
        String text = "madam";
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
