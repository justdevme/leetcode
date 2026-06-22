// Last updated: 6/22/2026, 9:21:29 PM
1class Solution {
2    public int jump(int[] nums) {
3        if (nums.length <= 1) return 0;
4
5        int count = 0;
6        int currentEnd = 0;
7        int farthest = 0;
8
9        for (int i = 0; i < nums.length - 1; i++) {
10            farthest = Math.max(farthest, i + nums[i]);
11
12            if (i == currentEnd) {
13                count++;
14                currentEnd = farthest;
15                if (currentEnd >= nums.length - 1) {
16                    break;
17                }
18            }
19        }
20        return count;
21    }
22}