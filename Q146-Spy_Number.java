public class SpyNumber {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
