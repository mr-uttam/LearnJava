public class MoveNegativeNumbersToBeginning {
    public static void main(String[] args) {
        int[] numbers = {4, -2, 7, -5, 1, -8};

        int[] result = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number < 0) {
                result[index++] = number;
            }
        }

        for (int number : numbers) {
            if (number >= 0) {
                result[index++] = number;
            }
        }

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
