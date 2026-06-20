class RangeSumQuery {
    // Declare the prefix array as an instance variable
    private int[] prefix;

    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1];

        // Build the prefix sum array
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        // O(1) retrieval
        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        RangeSumQuery obj = new RangeSumQuery(nums);
        System.out.println(obj.sumRange(0, 2));
    }
}

/**
 * Your RangeSumQuery object will be instantiated and called as such:
 * RangeSumQuery obj = new RangeSumQuery(nums);
 * int param_1 = obj.sumRange(left,right);
 */