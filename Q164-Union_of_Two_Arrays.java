import java.util.LinkedHashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {3, 4, 5, 6};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int number : first) {
            set.add(number);
        }

        for (int number : second) {
            set.add(number);
        }

        for (int number : set) {
            System.out.print(number + " ");
        }
    }
}
