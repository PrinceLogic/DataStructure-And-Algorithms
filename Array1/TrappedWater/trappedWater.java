public class trappedWater {
    public static int trappedWater(int heights[]) {
        int n = heights.length;
        // calculate left boundary
        int left[] = new int[n];
        left[0] = heights[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], heights[i]);
        }
        // calculate right boundary
        int right[] = new int[n];
        right[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], heights[i]);
        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print(trappedWater(heights));
    }
}
