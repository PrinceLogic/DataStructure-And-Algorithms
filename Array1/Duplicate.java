import java.util.*;

public class Duplicate {
    public static boolean duplicates(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 1, 4, 2 };
        System.out.println(duplicates(nums));
    }
}
