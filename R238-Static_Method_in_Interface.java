interface Calculator {

    static void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class StaticMethodInInterface {

    public static void main(String[] args) {
        Calculator.add(10, 20);
    }
}
