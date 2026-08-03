class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

public class SuperKeywordWithMethod extends Animal {

    void sound() {
        System.out.println("Dog Sound");
    }

    void display() {
        sound();
        super.sound();
    }

    public static void main(String[] args) {
        SuperKeywordWithMethod obj = new SuperKeywordWithMethod();
        obj.display();
    }
}
