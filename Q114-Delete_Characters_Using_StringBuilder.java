public class DeleteCharactersUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java Programming");

        builder.delete(4, 16);

        System.out.println(builder);
    }
}
