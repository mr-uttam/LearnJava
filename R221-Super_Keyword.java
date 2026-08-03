class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

public class SuperKeyword extends Animal {

    SuperKeyword() {
        super();
        System.out.println("Dog Constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword();
    }
}
