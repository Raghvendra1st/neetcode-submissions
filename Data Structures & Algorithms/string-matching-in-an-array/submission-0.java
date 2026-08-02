

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                // Do not match a word with itself
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // Found a match, skip to the next i
                }
            }
        }
        return result;
    }
}
