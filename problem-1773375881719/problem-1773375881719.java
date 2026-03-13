// Last updated: 3/13/2026, 11:24:41 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp, 1);
6        int result = 1;
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < i; j++) {
9                if (nums[j] < nums[i]) {
10                    dp[i] = Math.max(dp[i], dp[j] + 1);
11                }
12            }
13            result = Math.max(result, dp[i]);
14        }
15        return result;
16    }
17}