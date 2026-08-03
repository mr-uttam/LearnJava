abstract class Animal {

    abstract void sound();
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        Animal animal = new Animal() {

            @Override
            void sound() {
                System.out.println("Dog Bark");
            }
        };

        animal.sound();
    }
}
