public class InsertStringUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");

        builder.insert(4, " Programming");

        System.out.println(builder);
    }
}
