public class StaticNestedClass {

    static class Inner {

        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {

        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();

        obj.display();
    }
}
