public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2},
                {3, 4}
        };

        int[][] second = {
                {5, 6},
                {7, 8}
        };

        int[][] sum = new int[2][2];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        for (int[] row : sum) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
