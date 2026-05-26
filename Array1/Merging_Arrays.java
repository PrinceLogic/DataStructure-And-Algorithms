package Array1;

class Merging_Arrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for the last valid elements in nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;

        // Pointer for the end of the merged array (nums1)
        int p = m + n - 1;

        // Compare elements from the end and place the largest at the end of nums1
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them over.
        // (If there are remaining elements in nums1, they are already in the correct
        // place)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        Merging_Arrays m1 = new Merging_Arrays();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        m1.merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }
}