class SubarraySumOfK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        // The outer loop sets the starting point of the subarray
        for (int start = 0; start < nums.length; start++) {
            int currentSum = 0;

            // The inner loop expands the subarray and updates the sum
            for (int end = start; end < nums.length; end++) {
                currentSum += nums[end];

                // If we hit our target, count it
                if (currentSum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}