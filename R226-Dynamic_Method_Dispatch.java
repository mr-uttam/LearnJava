class Animal {

    void display() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    @Override
    void display() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {

    @Override
    void display() {
        System.out.println("Cat");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.display();

        animal = new Cat();
        animal.display();
    }
}
