public class ObjectAsMethodParameter {

    int value = 100;

    void display(ObjectAsMethodParameter obj) {
        System.out.println(obj.value);
    }

    public static void main(String[] args) {
        ObjectAsMethodParameter obj = new ObjectAsMethodParameter();
        obj.display(obj);
    }
}
