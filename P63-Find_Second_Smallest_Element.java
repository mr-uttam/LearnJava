public class FindSecondSmallestElement {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        System.out.println("Second Smallest = " + secondSmallest);
    }
}
