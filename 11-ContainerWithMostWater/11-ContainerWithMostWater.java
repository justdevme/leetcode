// Last updated: 3/23/2026, 12:24:51 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l = 0, r = height.length - 1;
4        int maxS = 0;
5
6        while (l < r) {
7            int area = Math.min(height[l], height[r]) * (r - l);
8            maxS = Math.max(maxS, area);
9            if (height[l] < height[r]) {
10                l++;
11            } else {
12                r--;
13            }
14        }
15        return maxS;
16    }
17}