// Last updated: 3/23/2026, 12:34:08 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total = 0;
4        for (int x : nums) total += x;
5        int leftSum = 0;
6        for (int i = 0; i < nums.length; i++) {
7            int rightSum = total - nums[i] - leftSum;
8
9            if (leftSum == rightSum) {
10                return i;
11            }
12            leftSum += nums[i];
13        }
14        return -1;
15    }
16}