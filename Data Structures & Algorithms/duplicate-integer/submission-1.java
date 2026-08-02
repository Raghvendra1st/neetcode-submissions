// 1. Put imports at the very top

class Solution { // 2. Then declare your class
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                return true; 
            }
        }
        
        return false; 
    }
}
