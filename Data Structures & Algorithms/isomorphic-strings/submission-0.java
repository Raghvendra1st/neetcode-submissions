class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Strings must be the same length to be isomorphic
        if (s.length() != t.length()) return false;
        
        // Track the last seen position (index + 1) for ASCII characters
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // If their previous positions don't match, they aren't isomorphic
            if (mapS[charS] != mapT[charT]) {
                return false;
            }
            
            // Store the current index + 1 (0 means unvisited)
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }
        
        return true;
    }
}
