public class StaticVariable {

    static String college = "ABC College";
    int id;
    String name;

    StaticVariable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable(101, "Rahul");
        StaticVariable s2 = new StaticVariable(102, "Amit");

        s1.display();
        s2.display();
    }
}
