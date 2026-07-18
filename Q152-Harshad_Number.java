public class HarshadNumber {
    public static void main(String[] args) {
        int number = 18;
        int original = number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (original % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
