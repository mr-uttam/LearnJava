public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
