public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                // If it's a letter, increase our word length count
                length++;
            } else if (length > 0) {
                // If it IS a space, AND we have already started counting a word,
                // it means we just finished the last word. Break the loop.
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}