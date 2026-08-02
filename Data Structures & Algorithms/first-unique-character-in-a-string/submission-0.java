
public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        
        // Step 1: Build the frequency map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }
        
        // Step 2: Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charCounts.get(ch) == 1) {
                return i; // Return the index immediately
            }
        }
        
        // Return -1 if no unique character exists
        return -1;
    }
}
