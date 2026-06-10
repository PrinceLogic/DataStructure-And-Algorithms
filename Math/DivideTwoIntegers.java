package Math;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // Handle the only overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result using XOR
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to prevent overflow when taking the absolute value
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract multiples of the divisor using bit shifting
        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            // Keep multiplying the divisor by 2 until it's bigger than the remaining
            // dividend
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest found multiple from the dividend
            dvd -= temp;
            // Add the corresponding multiple to the quotient
            quotient += multiple;
        }

        // Apply the sign to the final quotient
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(7, -3));
    }
}