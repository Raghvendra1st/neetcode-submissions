class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxStreak = 0;
        int currentStreak = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentStreak++;
                // Track the highest streak found so far
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                // Reset the counter when a 0 breaks the streak
                currentStreak = 0;
            }
        }
        
        return maxStreak;
    }
}
