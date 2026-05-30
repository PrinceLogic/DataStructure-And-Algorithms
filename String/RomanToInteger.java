package String;

class RomanToInteger {
    public static int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = getValue(s.charAt(i));

            // Check if we are at a subtraction instance
            // We also make sure i is not the last character to avoid OutOfBounds
            if (i < s.length() - 1 && currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                // Otherwise, it's standard addition
                total += currentVal;
            }
        }

        return total;
    }

    // Helper function to easily map the characters to integers
    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}