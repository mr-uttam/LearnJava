public class TwinPrimeNumbers {
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
        int first = 17;
        int second = 19;

        if (isPrime(first) && isPrime(second) && second - first == 2) {
            System.out.println("Twin Prime Numbers");
        } else {
            System.out.println("Not Twin Prime Numbers");
        }
    }
}
