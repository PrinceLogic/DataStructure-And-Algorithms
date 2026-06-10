package String;

public class FindDifference {
    public static char findTheDifference(String s, String t) {
        char extraChar = 0;

        // Since t is exactly 1 character longer than s,
        // we can XOR matching indices in a single loop.
        for (int i = 0; i < s.length(); i++) {
            extraChar ^= s.charAt(i);
            extraChar ^= t.charAt(i);
        }

        // Don't forget to XOR the final character in t
        extraChar ^= t.charAt(t.length() - 1);

        return extraChar;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}