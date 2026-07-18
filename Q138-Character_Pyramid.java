public class CharacterPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            char ch = 'A';

            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            System.out.println();
        }
    }
}
