public class DisariumNumber {
    public static void main(String[] args) {
        int number = 135;
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            digits--;
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
    }
}
