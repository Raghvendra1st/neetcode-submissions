

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            // Returns immediately
            return false;
        }

        // 2. Convert both strings into character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // 3. Sort both arrays alphabetically
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // 4. Check if the sorted arrays are exactly identical
        return Arrays.equals(sArray, tArray);
    }
}
