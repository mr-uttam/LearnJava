public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading("Java");
    }
}
