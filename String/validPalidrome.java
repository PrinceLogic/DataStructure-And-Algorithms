class validPalidrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            // Move the left pointer if it's not alphanumeric
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            }
            // Move the right pointer if it's not alphanumeric
            else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            }
            // Both pointers are on valid characters, so compare them
            else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    return false; // Mismatch found
                }
                left++;
                right--;
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}