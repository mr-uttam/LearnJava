abstract class Shape {

    abstract void draw();

    abstract void area();
}

public class MultipleAbstractMethods extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void area() {
        System.out.println("Calculating Area");
    }

    public static void main(String[] args) {
        MultipleAbstractMethods obj = new MultipleAbstractMethods();
        obj.draw();
        obj.area();
    }
}
