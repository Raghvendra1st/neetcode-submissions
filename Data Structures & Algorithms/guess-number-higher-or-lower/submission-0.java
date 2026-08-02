/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int l = 1; 
        int r = n;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int res = guess(mid); // Changed from pick(mid) to guess(mid)
            
            if (res == 0) {
                return mid;
            } else if (res > 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1; // Keep -1 as a fallback default return
    }
}
