public class FindSmallestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67};

        int smallest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest Element = " + smallest);
    }
}
