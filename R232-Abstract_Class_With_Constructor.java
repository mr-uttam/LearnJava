abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }

    abstract void sound();
}

public class AbstractClassWithConstructor extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }

    public static void main(String[] args) {
        AbstractClassWithConstructor obj = new AbstractClassWithConstructor();
        obj.sound();
    }
}
