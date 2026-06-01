/**
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * 
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

public class findingFirstLastno {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };

        // Find the first occurrence
        result[0] = findPosition(nums, target, true);

        // If the target wasn't found at all, no need to search for the last occurrence
        if (result[0] != -1) {
            // Find the last occurrence
            result[1] = findPosition(nums, target, false);
        }

        return result;
    }

    private static int findPosition(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // Target found
                ans = mid;
                if (findFirst) {
                    // Keep searching to the left for an earlier occurrence
                    right = mid - 1;
                } else {
                    // Keep searching to the right for a later occurrence
                    left = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(searchRange(nums, target));
    }
}
