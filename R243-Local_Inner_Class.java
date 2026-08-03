public class LocalInnerClass {

    void display() {

        class Inner {

            void message() {
                System.out.println("Inside Local Inner Class");
            }
        }

        Inner obj = new Inner();
        obj.message();
    }

    public static void main(String[] args) {

        LocalInnerClass obj = new LocalInnerClass();

        obj.display();
    }
}
