public class PangramCheck {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        text = text.toLowerCase();

        boolean[] letters = new boolean[26];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        boolean pangram = true;

        for (boolean value : letters) {
            if (!value) {
                pangram = false;
                break;
            }
        }

        if (pangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
