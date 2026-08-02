public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Search space: speed ranges from 1 to the largest pile
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        int result = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Midpoint represents speed 'k'
            long totalHoursSpent = 0;
            
            // Calculate total hours needed at speed 'mid'
            for (int pile : piles) {
                // Ceiling division to handle leftover bananas in a pile
                totalHoursSpent += (pile + mid - 1) / mid; 
            }
            
            // If Koko finishes on time, try a slower speed
            if (totalHoursSpent <= h) {
                result = mid;
                right = mid - 1;
            } else { // Too slow, increase the speed
                left = mid + 1;
            }
        }
        return result;
    }
}
