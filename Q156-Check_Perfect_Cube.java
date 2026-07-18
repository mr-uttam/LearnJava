public class CheckPerfectCube {
    public static void main(String[] args) {
        int number = 125;
        int cubeRoot = (int) Math.round(Math.cbrt(number));

        if (cubeRoot * cubeRoot * cubeRoot == number) {
            System.out.println("Perfect Cube");
        } else {
            System.out.println("Not a Perfect Cube");
        }
    }
}
