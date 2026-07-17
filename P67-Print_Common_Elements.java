public class PrintCommonElements {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {3, 4, 5, 6, 7};

        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    System.out.println(i);
                }
            }
        }
    }
}
