package String;
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int a = 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                a = i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
