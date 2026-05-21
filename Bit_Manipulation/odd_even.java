package Bit_Manipulation;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}