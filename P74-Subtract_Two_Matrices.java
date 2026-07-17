public class SubtractTwoMatrices {
    public static void main(String[] args) {
        int[][] first = {
                {8, 7},
                {6, 5}
        };

        int[][] second = {
                {4, 3},
                {2, 1}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] - second[i][j];
            }
        }

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
