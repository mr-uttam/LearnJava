import java.util.Scanner;

public class InputAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int number : numbers) {
            System.out.println(number);
        }

        sc.close();
    }
}
