class SearchInRotatedArray2 {
    public static boolean search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 1. Target found
            if (nums[mid] == target) {
                return true;
            }

            // 2. The Duplicate Edge Case: Shrink the search space
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
                continue;
            }

            // 3. Left half is safely sorted
            if (nums[left] <= nums[mid]) {
                // Check if the target is within the sorted left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // 4. Right half is safely sorted
            else {
                // Check if the target is within the sorted right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        // Target was not found
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        System.out.println(search2(nums, target));
    }
}