class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
