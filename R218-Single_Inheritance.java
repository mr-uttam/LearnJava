class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

public class SingleInheritance extends Animal {

    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();

        obj.sound();
    }
}
