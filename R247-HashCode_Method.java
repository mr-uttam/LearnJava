public class HashCodeMethod {

    int id;

    HashCodeMethod(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {

        HashCodeMethod obj = new HashCodeMethod(100);

        System.out.println(obj.hashCode());
    }
}
