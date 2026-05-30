package SubArrayConcept;

public class MaxSum {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; // maximum sum
        int cs = 0; // current sum

        // Check if all numbers are negative
        boolean allNegative = true;
        for (int num : numbers) {
            if (num >= 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative) {
            // For all negative numbers: find the maximum (least negative) element
            ms = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                ms = Math.max(ms, numbers[i]);
            }
            System.out.println("All numbers are negative. The max sum is: " + ms);
        } else {
            // For mixed numbers: standard Kadane's algorithm
            for (int i = 0; i < numbers.length; i++) {
                cs = cs + numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("The max sum is: " + ms);
        }
    }

    public static void main(String[] args) {
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; // for mixed numbers
        int numbers[] = { -1, -2, -3, -4 }; // for all negative numbers
        kadanes(numbers);
    }
}
