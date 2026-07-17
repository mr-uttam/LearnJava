import java.util.Arrays;

public class SortArrayInDescendingOrder {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67};

        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
