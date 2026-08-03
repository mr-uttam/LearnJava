public class LexicographicalComparison {
    public static void main(String[] args) {
        String first = "Apple";
        String second = "Banana";

        int result = first.compareTo(second);

        if (result == 0) {
            System.out.println("Both Strings are Equal");
        } else if (result < 0) {
            System.out.println(first + " comes before " + second);
        } else {
            System.out.println(first + " comes after " + second);
        }
    }
}
