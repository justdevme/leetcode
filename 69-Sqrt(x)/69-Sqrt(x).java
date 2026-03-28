// Last updated: 3/28/2026, 4:35:51 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0) return 0;
4        int l = 0, r = x;
5        while (l <= r) {
6            int mid = l + (r - l)/ 2;
7            long sq = (long) mid * mid;
8            if(sq == x) return mid;
9            else if (sq < x) {
10                l = mid + 1;
11            } else {
12                r = mid - 1;
13            }
14        }
15        return r;
16    }
17}