public class EmirpNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 13;
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (isPrime(number) && isPrime(reverse) && number != reverse) {
            System.out.println("Emirp Number");
        } else {
            System.out.println("Not an Emirp Number");
        }
    }
}
