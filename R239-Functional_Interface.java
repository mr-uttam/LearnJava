@FunctionalInterface
interface Message {

    void display();
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Message message = () -> System.out.println("Hello Java");

        message.display();
    }
}
