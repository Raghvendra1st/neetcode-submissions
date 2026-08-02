class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If mid is even, mid ^ 1 is mid + 1
            // If mid is odd, mid ^ 1 is mid - 1
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return nums[low];
    }
}
