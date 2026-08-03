public class ObjectCloning implements Cloneable {

    int id = 101;
    String name = "Uttam";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloning student1 = new ObjectCloning();

        ObjectCloning student2 = (ObjectCloning) student1.clone();

        System.out.println(student1.id + " " + student1.name);
        System.out.println(student2.id + " " + student2.name);
    }
}
