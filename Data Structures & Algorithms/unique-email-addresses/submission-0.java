
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            StringBuilder cleanLocal = new StringBuilder();
            char[] chars = email.toCharArray();
            int i = 0;
            
            // Step 1: Process the local name via character array pointer
            while (i < chars.length) {
                char c = chars[i];
                if (c == '@') {
                    break;
                } else if (c == '.') {
                    i++;
                    continue;
                } else if (c == '+') {
                    // Skip the rest of the local name until we hit '@'
                    while (chars[i] != '@') {
                        i++;
                    }
                    break;
                } else {
                    cleanLocal.append(c);
                    i++;
                }
            }
            
            // Step 2: Append the domain name starting from the current '@' index
            String domain = email.substring(i);
            cleanLocal.append(domain);
            
            uniqueEmails.add(cleanLocal.toString());
        }
        
        return uniqueEmails.size();
    }
}
