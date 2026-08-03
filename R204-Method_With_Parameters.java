public class MethodWithParameters {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        MethodWithParameters obj = new MethodWithParameters();
        obj.add(10, 20);
    }
}
