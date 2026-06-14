import java.util.Arrays;

class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int k = 0; // Pointer for the result array

        // We know the maximum possible size of the intersection
        // is the length of the smaller array.
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        // Step 2: Traverse both arrays with two pointers
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // We found a match!
                // Only add it if it's the first element or not a duplicate of the last added
                // element.
                if (k == 0 || result[k - 1] != nums1[i]) {
                    result[k] = nums1[i];
                    k++;
                }
                // Move both pointers forward
                i++;
                j++;
            }
        }

        // Step 3: Trim the array to the actual number of elements found
        return Arrays.copyOf(result, k);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}