public class AutomorphicNumber {
    public static void main(String[] args) {
        int number = 25;
        int square = number * number;

        if (String.valueOf(square).endsWith(String.valueOf(number))) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
