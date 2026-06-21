import java.util.HashMap;
import java.util.Map;

class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        // Map to store (runningSum, earliest_index)
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize for subarrays starting at index 0
        map.put(0, -1);

        int maxLength = 0;
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1, 1 as 1
            runningSum += (nums[i] == 1) ? 1 : -1;

            // If we've seen this sum before, calculate the length
            if (map.containsKey(runningSum)) {
                int length = i - map.get(runningSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Otherwise, store the sum and its index
                map.put(runningSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 1, 1, 0, 1 };
        System.out.println(ContiguousArray.findMaxLength(nums));
    }
}