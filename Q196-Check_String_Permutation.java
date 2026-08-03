import java.util.Arrays;

public class CheckStringPermutation {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Valid Permutation");
        } else {
            System.out.println("Invalid Permutation");
        }
    }
}
