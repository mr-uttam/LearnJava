public class ThisKeyword {

    int id;
    String name;

    ThisKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(101, "Uttam");
        obj.display();
    }
}
