// Last updated: 3/28/2026, 7:35:47 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1;
4        int right = Arrays.stream(piles).max().getAsInt();
5        int ans = right;
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            long totalHours = 0;
10
11            for (int pile : piles) {
12                totalHours += (pile + mid - 1) / mid;
13            }
14
15            if (totalHours <= h) {
16                ans = mid;
17                right = mid - 1;
18            } else {
19                left = mid + 1;
20            }
21        }
22
23        return ans;
24    }
25}