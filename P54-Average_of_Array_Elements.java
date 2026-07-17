public class AverageOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 18, 20, 25};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average = " + average);
    }
}
