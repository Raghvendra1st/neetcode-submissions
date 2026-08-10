

class Solution {
    public int heightChecker(int[] heights) {
        // 1. Create a copy of the original array
        int[] expected = heights.clone();
        
        // 2. Sort the copied array to get the expected order
        Arrays.sort(expected);
        
        // 3. Count the indices where heights do not match
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        
        // 4. Return the total number of mismatched positions
        return count;
    }
}
