import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: If the current number is > 0, we can't possibly sum to 0
            if (nums[i] > 0)
                break;

            // Step 2: Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Step 3: Set up two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second element (left pointer)
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for the third element (right pointer)
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after finding a valid sum
                    left++;
                    right--;

                } else if (sum < 0) {
                    // Sum is too small, we need a larger number
                    left++;
                } else {
                    // Sum is too large, we need a smaller number
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(Arrays.toString(threeSum(nums).toArray()) + " " + " " + " ");
    }
}