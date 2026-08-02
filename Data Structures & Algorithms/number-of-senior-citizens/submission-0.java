class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        
        for (String detail : details) {
            // Index 11 is the first digit of age
            char firstDigit = detail.charAt(11); 
            // Index 12 is the second digit of age
            char secondDigit = detail.charAt(12); 
            
            // To be older than 60:
            // Either the first digit is 7, 8, or 9
            // OR the first digit is exactly 6 AND the second digit is greater than 0
            if (firstDigit > '6' || (firstDigit == '6' && secondDigit > '0')) {
                count++;
            }
        }
        
        return count;
    }
}
