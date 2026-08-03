class Animal {

    String color = "White";
}

public class SuperKeywordWithVariable extends Animal {

    String color = "Black";

    void display() {
        System.out.println(color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        SuperKeywordWithVariable obj = new SuperKeywordWithVariable();
        obj.display();
    }
}
