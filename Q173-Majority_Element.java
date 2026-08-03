public class MajorityElement {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 1, 2, 2, 2};

        int candidate = 0;
        int count = 0;

        for (int number : numbers) {
            if (count == 0) {
                candidate = number;
            }

            if (number == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority Element = " + candidate);
    }
}
