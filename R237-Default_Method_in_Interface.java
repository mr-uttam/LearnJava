interface Vehicle {

    default void start() {
        System.out.println("Vehicle Started");
    }
}

public class DefaultMethodInInterface implements Vehicle {

    public static void main(String[] args) {
        DefaultMethodInInterface obj = new DefaultMethodInInterface();
        obj.start();
    }
}
