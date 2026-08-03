class Animal {
}

class Dog extends Animal {
}

public class InstanceofOperator {

    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
    }
}
