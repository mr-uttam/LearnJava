public class EqualsMethod {

    int id;

    EqualsMethod(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EqualsMethod)) {
            return false;
        }

        EqualsMethod other = (EqualsMethod) obj;

        return id == other.id;
    }

    public static void main(String[] args) {

        EqualsMethod obj1 = new EqualsMethod(10);
        EqualsMethod obj2 = new EqualsMethod(10);

        System.out.println(obj1.equals(obj2));
    }
}
