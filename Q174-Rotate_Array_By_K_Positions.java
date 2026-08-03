public class RotateArrayByKPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k %= numbers.length;

        reverse(numbers, 0, numbers.length - 1);
        reverse(numbers, 0, k - 1);
        reverse(numbers, k, numbers.length - 1);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
