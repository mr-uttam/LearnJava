abstract class Animal {

    abstract void sound();
}

public class AbstractClass extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.sound();
    }
}
