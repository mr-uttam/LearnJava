public class ParameterizedConstructor {

    int id;
    String name;

    ParameterizedConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ParameterizedConstructor student = new ParameterizedConstructor(101, "Uttam");

        System.out.println(student.id);
        System.out.println(student.name);
    }
}
