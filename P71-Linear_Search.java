public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 38, 41, 56, 72};
        int target = 41;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
