class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String str = s.trim(); // Removes trailing and leading spaces
        
        // Loop backwards starting from the last character
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++; // Keep tracking the length of the word
            } else {
                break; // Stop immediately when you hit the space before the last word
            }
        }
        return count; 
    }
}
