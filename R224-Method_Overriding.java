class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

public class MethodOverriding extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.sound();
    }
}
