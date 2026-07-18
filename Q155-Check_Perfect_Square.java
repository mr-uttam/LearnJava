public class CheckPerfectSquare {
    public static void main(String[] args) {
        int number = 49;
        int root = (int) Math.sqrt(number);

        if (root * root == number) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}
