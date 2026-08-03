
class Solution {
    public int maxDifference(String s) {
        // Fixed spelling of Character
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Fixed capital A in toCharArray() and map variable name inside put
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        } 
        
        int maxodd = 0;
        // Fixed lowercase Integer
        int mineven = Integer.MAX_VALUE;
        
        // Fixed map.values() with an 's'
        for (int freq : map.values()) {
            if (freq % 2 != 0) {
                if (freq > maxodd) {
                    maxodd = freq;
                }
            } else {
                // Fixed missing 'if' statement
                if (freq < mineven) {
                    mineven = freq;
                }
            }
        }
        
        int result = maxodd - mineven;
        // Return the answer to pass LeetCode/HackerRank tests
        return result; 
    }
}
