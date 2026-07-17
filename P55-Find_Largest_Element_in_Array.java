public class FindLargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67};

        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}
