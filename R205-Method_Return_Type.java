public class MethodReturnType {

    int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        MethodReturnType obj = new MethodReturnType();

        System.out.println(obj.square(8));
    }
}
