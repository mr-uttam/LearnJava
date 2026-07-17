import java.util.Arrays;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67};

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
