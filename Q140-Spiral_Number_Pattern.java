public class SpiralNumberPattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}
