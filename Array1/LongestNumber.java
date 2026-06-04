import java.util.Arrays;

public class LongestNumber {

    public static String largestNumber(int[] nums) {
        // Step 1: Convert integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort strings according to custom comparator
        Arrays.sort(strNums, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            // Compare order2 to order1 for descending order
            return order2.compareTo(order1);
        });

        // Step 3: Handle edge case where the largest number is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Step 4: Build the final result
        StringBuilder largestNum = new StringBuilder();
        for (String num : strNums) {
            largestNum.append(num);
        }

        return largestNum.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        System.out.println(largestNumber(nums));
    }
}