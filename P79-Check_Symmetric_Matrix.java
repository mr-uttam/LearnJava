public class CheckSymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}
        };

        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) {
            System.out.println("Symmetric Matrix");
        } else {
            System.out.println("Not a Symmetric Matrix");
        }
    }
}
