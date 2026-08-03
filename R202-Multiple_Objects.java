public class MultipleObjects {
    int id;
    String name;

    public static void main(String[] args) {
        MultipleObjects student1 = new MultipleObjects();
        MultipleObjects student2 = new MultipleObjects();

        student1.id = 101;
        student1.name = "Rahul";

        student2.id = 102;
        student2.name = "Amit";

        System.out.println(student1.id + " " + student1.name);
        System.out.println(student2.id + " " + student2.name);
    }
}
