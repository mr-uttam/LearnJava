public class MaximumDifference {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 10, 6, 4, 8, 1};

        int min = numbers[0];
        int maxDifference = numbers[1] - numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - min > maxDifference) {
                maxDifference = numbers[i] - min;
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum Difference = " + maxDifference);
    }
}
