public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6};

        int[] merged = new int[first.length + second.length];

        int index = 0;

        for (int number : first) {
            merged[index++] = number;
        }

        for (int number : second) {
            merged[index++] = number;
        }

        for (int number : merged) {
            System.out.println(number);
        }
    }
}
