public class KrishnamurthyNumber {
    public static void main(String[] args) {
        int number = 145;
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Krishnamurthy Number");
        } else {
            System.out.println("Not a Krishnamurthy Number");
        }
    }
}
