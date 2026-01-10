// Last updated: 1/10/2026, 2:30:42 PM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int low = 1, high = n;
13        while (low <= high) {
14            int mid = low + (high - low) / 2;
15            int g = guess(mid);
16            if (g == 0) {
17                return mid;
18            } else if (g == -1) {
19                high = mid - 1;
20            } else {
21                low = mid + 1;
22            }
23        }
24        return -1;
25    }
26}