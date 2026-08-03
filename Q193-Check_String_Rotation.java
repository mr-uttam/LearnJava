public class CheckStringRotation {
    public static void main(String[] args) {
        String first = "ABCD";
        String second = "CDAB";

        if (first.length() == second.length() && (first + first).contains(second)) {
            System.out.println("String Rotation");
        } else {
            System.out.println("Not a String Rotation");
        }
    }
}
