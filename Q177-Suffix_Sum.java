public class SuffixSum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        int[] suffix = new int[numbers.length];

        suffix[numbers.length - 1] = numbers[numbers.length - 1];

        for (int i = numbers.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + numbers[i];
        }

        for (int value : suffix) {
            System.out.print(value + " ");
        }
    }
}
