public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String text = "Java Programming";

        StringBuilder builder = new StringBuilder(text);

        System.out.println(builder.reverse());
    }
}
