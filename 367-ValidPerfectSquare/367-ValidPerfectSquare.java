// Last updated: 3/28/2026, 4:39:31 PM
1class Solution {
2    public boolean isPerfectSquare(int x) {
3        if (x == 0) return true;
4        int l = 0, r = x;
5        while (l <= r) {
6            int mid = (l + r) / 2;
7            long sq = (long) mid * mid;
8            if(sq == x) return true;
9            else if (sq < x) {
10                l = mid + 1;
11            } else {
12                r = mid - 1;
13            }
14        }
15        return false;
16    }
17}