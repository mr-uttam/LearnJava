interface Addition {

    int add(int a, int b);
}

public class LambdaExpression {

    public static void main(String[] args) {
        Addition addition = (a, b) -> a + b;

        System.out.println(addition.add(10, 20));
    }
}
