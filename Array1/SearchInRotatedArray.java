class SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the Left half is sorted
            if (nums[left] <= nums[mid]) {
                // Check if target is strictly within the sorted Left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Target is on the left
                } else {
                    left = mid + 1; // Target is on the right
                }
            }
            // Otherwise, the Right half must be sorted
            else {
                // Check if target is strictly within the sorted Right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Target is on the right
                } else {
                    right = mid - 1; // Target is on the left
                }
            }
        }

        // Target is not in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(nums, target));
    }
}