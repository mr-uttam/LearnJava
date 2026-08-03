public class MemberInnerClass {

    private String message = "Hello Java";

    class Inner {

        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {

        MemberInnerClass outer = new MemberInnerClass();

        MemberInnerClass.Inner inner = outer.new Inner();

        inner.display();
    }
}
