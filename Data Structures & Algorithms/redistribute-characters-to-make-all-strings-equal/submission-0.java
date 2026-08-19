class Solution {
    public boolean makeEqual(String[] words) {
        // 1. Create a frequency array for the 26 lowercase English letters
        int[] charCounts = new int[26];
        int totalWords = words.length;

        // 2. Count the total occurrences of every character across all words
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                charCounts[word.charAt(i) - 'a']++;
            }
        }

        // 3. Every character's total count must be divisible by the number of words
        for (int count : charCounts) {
            if (count % totalWords != 0) {
                return false; // Cannot distribute this letter evenly
            }
        }

        return true; // All letters can be evenly distributed
    }
}
