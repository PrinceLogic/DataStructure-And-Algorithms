//Count how many times lowercase vowels occurred in a String entered by the user.
package String;

import java.util.Scanner;

public class lowercase_Vowels {
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int count = countVowels(str);
        System.out.println(count);
        sc.close();
    }
}