public class CharacterOccurrence {
    public static void main(String[] args) {
        String text = "Programming";
        char target = 'g';

        int count = 0;

        for (char ch : text.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }

        System.out.println(target + " = " + count);
    }
}
