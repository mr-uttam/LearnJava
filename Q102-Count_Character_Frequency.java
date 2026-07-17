public class CountCharacterFrequency {
    public static void main(String[] args) {
        String text = "programming";

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " = " + frequency[i]);
            }
        }
    }
}
