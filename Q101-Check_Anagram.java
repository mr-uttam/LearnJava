public class CheckAnagram {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        if (java.util.Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
