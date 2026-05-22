package Bit_Manipulation;

public class PowerOfTwo {
    public static boolean check(int n) {
        return n > 0 && (n * (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // int n = 10;
        int n = 64;
        System.out.println(check(n));
    }
}