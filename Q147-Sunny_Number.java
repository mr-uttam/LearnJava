public class SunnyNumber {
    public static void main(String[] args) {
        int number = 8;
        int value = number + 1;
        int root = (int) Math.sqrt(value);

        if (root * root == value) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not a Sunny Number");
        }
    }
}
