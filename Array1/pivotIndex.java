class pivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Step 2: Iterate to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // rightSum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }

            // Add current element to leftSum for the next iteration
            leftSum += nums[i];
        }

        // Step 3: No pivot index found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}