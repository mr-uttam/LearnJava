import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67, 10};

        Arrays.sort(numbers);

        int target = 67;
        int low = 0;
        int high = numbers.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                index = mid;
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
