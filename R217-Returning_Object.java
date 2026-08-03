public class ReturningObject {

    int value = 500;

    ReturningObject getObject() {
        return this;
    }

    public static void main(String[] args) {
        ReturningObject obj = new ReturningObject();

        System.out.println(obj.getObject().value);
    }
}
