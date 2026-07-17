public class ReplaceStringUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java Programming");

        builder.replace(5, 16, "Developer");

        System.out.println(builder);
    }
}
