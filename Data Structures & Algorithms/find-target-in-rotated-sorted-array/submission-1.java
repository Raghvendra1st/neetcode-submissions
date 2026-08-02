class Solution { 
    public int search(int[] nums, int target) { 
        int l = 0; 
        int r = nums.length - 1; 
        
        // Loop needs to be <= to check the single element space
        while (l <= r) { 
            int mid = l + (r - l) / 2; 
            
            // 1. Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }
            
            // 2. Determine which half is sorted
            if (nums[l] <= nums[mid]) { 
                // Left half is sorted
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1; // Target is in the left half
                } else {
                    l = mid + 1; // Target is in the right half
                }
            } else { 
                // Right half is sorted
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1; // Target is in the right half
                } else {
                    r = mid - 1; // Target is in the left half
                }
            } 
        } 
        // Return an integer, not a string
        return -1; 
    } 
}
