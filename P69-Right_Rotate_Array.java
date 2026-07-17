public class RightRotateArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int last = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = last;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
