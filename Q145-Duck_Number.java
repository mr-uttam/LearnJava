public class DuckNumber {
    public static void main(String[] args) {
        String number = "1205";

        if (number.charAt(0) != '0' && number.contains("0")) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }
}
