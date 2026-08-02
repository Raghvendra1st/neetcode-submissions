class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            // Only check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check left neighbor (or if it's the start) AND right neighbor (or if it's the end)
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    n--;
                    i++; // Skip the next index since we just planted a flower here
                }
            }
            
            // Fast exit check
            if (n <= 0) {
                return true;
            }
        }
        
        return n <= 0;
    }
}
