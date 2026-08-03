interface Printable {

    void print();
}

interface Showable {

    void show();
}

public class MultipleInterfaces implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void show() {
        System.out.println("Showing");
    }

    public static void main(String[] args) {
        MultipleInterfaces obj = new MultipleInterfaces();

        obj.print();
        obj.show();
    }
}
