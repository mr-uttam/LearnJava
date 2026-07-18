public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {1, 0, 2, 0, 3, 4, 0, 5};

        int index = 0;

        for (int number : numbers) {
            if (number != 0) {
                numbers[index++] = number;
            }
        }

        while (index < numbers.length) {
            numbers[index++] = 0;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
