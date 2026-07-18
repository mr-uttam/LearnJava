import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int number : first) {
            set.add(number);
        }

        for (int number : second) {
            if (set.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
