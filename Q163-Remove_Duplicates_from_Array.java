import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int number : numbers) {
            set.add(number);
        }

        for (int number : set) {
            System.out.print(number + " ");
        }
    }
}
