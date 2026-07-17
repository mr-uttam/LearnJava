public class SplitString {
    public static void main(String[] args) {
        String text = "Apple,Banana,Mango,Grapes";

        String[] fruits = text.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
