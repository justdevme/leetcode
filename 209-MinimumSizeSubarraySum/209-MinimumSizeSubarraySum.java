// Last updated: 4/9/2026, 1:57:46 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int minLen = Integer.MAX_VALUE;
6
7        for (int right = 0; right < nums.length; right++) {
8            sum += nums[right];
9            while (sum >= target) {
10                minLen = Math.min(minLen, right - left + 1);
11                sum -= nums[left];
12                left++;
13            }
14        }
15        return minLen == Integer.MAX_VALUE ? 0 : minLen;
16    }
17}